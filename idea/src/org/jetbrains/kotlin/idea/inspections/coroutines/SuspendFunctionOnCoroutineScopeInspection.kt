/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.inspections.coroutines

import com.intellij.codeInspection.*
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiElementVisitor
import com.intellij.psi.codeStyle.CodeStyleManager
import org.jetbrains.kotlin.descriptors.ReceiverParameterDescriptor
import org.jetbrains.kotlin.idea.caches.resolve.resolveToDescriptorIfAny
import org.jetbrains.kotlin.idea.core.ShortenReferences
import org.jetbrains.kotlin.idea.core.replaced
import org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection
import org.jetbrains.kotlin.idea.inspections.UnusedReceiverParameterInspection
import org.jetbrains.kotlin.idea.intentions.MoveMemberToCompanionObjectIntention
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.*
import org.jetbrains.kotlin.psi.psiUtil.getNonStrictParentOfType
import org.jetbrains.kotlin.psi.typeRefHelpers.setReceiverTypeReference
import org.jetbrains.kotlin.resolve.descriptorUtil.fqNameSafe
import org.jetbrains.kotlin.types.KotlinType

class SuspendFunctionOnCoroutineScopeInspection : AbstractKotlinInspection() {

    private fun KotlinType.isCoroutineScope(): Boolean =
        constructor.declarationDescriptor?.fqNameSafe?.asString() == COROUTINE_SCOPE

    private fun ReceiverParameterDescriptor?.ofCoroutineScopeType(): Boolean {
        if (this == null) return false
        if (type.isCoroutineScope()) return true
        return type.constructor.supertypes.reversed().any { it.isCoroutineScope() }
    }

    override fun buildVisitor(holder: ProblemsHolder, isOnTheFly: Boolean): PsiElementVisitor {
        return namedFunctionVisitor(fun(function: KtNamedFunction) {
            if (!function.hasModifier(KtTokens.SUSPEND_KEYWORD)) return

            val descriptor = function.resolveToDescriptorIfAny() ?: return
            val (extensionOfCoroutineScope, memberOfCoroutineScope) = with(descriptor) {
                extensionReceiverParameter.ofCoroutineScopeType() to dispatchReceiverParameter.ofCoroutineScopeType()
            }
            if (!extensionOfCoroutineScope && !memberOfCoroutineScope) return

            val fixes = mutableListOf<LocalQuickFix>()
            if (function.hasBody()) {
                fixes += WrapWithCoroutineScopeFix(isExtension = extensionOfCoroutineScope)
            }
            if (extensionOfCoroutineScope) {
                fixes += UnusedReceiverParameterInspection.RemoveReceiverFix(inSameClass = true, isRedundant = false)
            }
            if (memberOfCoroutineScope) {
                fixes += IntentionWrapper(MoveMemberToCompanionObjectIntention(), function.containingKtFile)
            }

            holder.registerProblem(
                with(function) { receiverTypeReference ?: nameIdentifier ?: funKeyword ?: this },
                if (extensionOfCoroutineScope) "Extension suspend function of CoroutineScope"
                else "Member suspend function in sub-class of CoroutineScope",
                ProblemHighlightType.GENERIC_ERROR_OR_WARNING,
                *fixes.toTypedArray()
            )
        })
    }

    private class WrapWithCoroutineScopeFix(private val isExtension: Boolean) : LocalQuickFix {
        override fun getFamilyName(): String = "Wrap with coroutineScope"

        override fun getName(): String =
            if (isExtension) "Remove receiver & wrap with 'coroutineScope { ... }'"
            else "Wrap with 'coroutineScope { ... }'"

        override fun applyFix(project: Project, descriptor: ProblemDescriptor) {
            val function = descriptor.psiElement.getNonStrictParentOfType<KtNamedFunction>() ?: return
            if (isExtension) {
                function.setReceiverTypeReference(null)
            }

            val bodyExpression = function.bodyExpression
            if (bodyExpression != null) {
                val factory = KtPsiFactory(function)
                val blockExpression = function.bodyBlockExpression
                val result = if (blockExpression == null) {
                    bodyExpression.replaced(
                        factory.createExpressionByPattern("$COROUTINE_SCOPE_WRAPPER { $0 }", bodyExpression)
                    )
                } else {
                    val bodyText = buildString {
                        for (statement in blockExpression.statements) {
                            append(statement.text)
                        }
                    }
                    blockExpression.replaced(
                        factory.createBlock("$COROUTINE_SCOPE_WRAPPER { $bodyText }")
                    )
                }
                val reformatted = CodeStyleManager.getInstance(project).reformat(result)
                ShortenReferences.DEFAULT.process(reformatted as KtElement)
            }
        }
    }

    companion object {
        private const val COROUTINE_SCOPE = "kotlinx.coroutines.CoroutineScope"

        private const val COROUTINE_SCOPE_WRAPPER = "kotlinx.coroutines.coroutineScope"
    }
}