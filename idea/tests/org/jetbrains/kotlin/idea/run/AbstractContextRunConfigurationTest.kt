/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.run

import com.intellij.execution.configurations.RunConfiguration
import com.intellij.execution.junit.JUnitConfiguration
import com.intellij.openapi.roots.ModuleRootModificationUtil
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.psi.PsiComment
import com.intellij.psi.PsiDocumentManager
import com.intellij.testFramework.PsiTestUtil
import junit.framework.TestCase
import org.jetbrains.kotlin.idea.stubs.AbstractMultiModuleTest
import org.jetbrains.kotlin.idea.test.*
import org.jetbrains.kotlin.idea.util.application.runWriteAction
import org.jetbrains.kotlin.idea.util.projectStructure.getModuleDir
import org.jetbrains.kotlin.lexer.KtTokens
import org.jetbrains.kotlin.psi.psiUtil.findDescendantOfType
import org.jetbrains.kotlin.utils.sure
import org.junit.Assert
import java.io.File
import kotlin.reflect.KVisibility
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties

abstract class AbstractContextRunConfigurationTest : AbstractMultiModuleTest() {
    fun doTest(path: String) {
        setUpModulePaths(path)

        checkFiles({ project.allKotlinFiles() }) {
            checkHighlighting(editor, false, false)

            val element = file.findElementAt(editor.caretModel.offset)!!
            val runConfiguration = createConfigurationFromElement(element)

            val comment = file.findDescendantOfType<PsiComment> {
                it.tokenType == KtTokens.BLOCK_COMMENT
            }.sure { "No comment found" }
            val expectedMap = comment.text.lines().map { it.trim('*', '/', ' ') }.filter { it.isNotBlank() }.map {
                val (name, value) = it.split("=").map { it.trim() }
                Pair(name, value)
            }.toMap()
            val actualMap = extractActual(runConfiguration)
            for ((name, expectedValue) in expectedMap) {
                val actualValue = actualMap[name]
                if (actualValue == null) {
                    Assert.fail("Run configuration doesn't have a property $name")
                }
                Assert.assertEquals("$name should be $expectedValue, but was $actualValue", expectedValue, actualValue)
            }
        }

    }

    private fun extractActual(runConfiguration: RunConfiguration): Map<String, String> {
        val result = mutableMapOf<String, String>()
        result["type"] = runConfiguration.type.displayName
        when (runConfiguration) {
            is JUnitConfiguration -> {
                val persistentData = runConfiguration.persistentData
                JUnitConfiguration.Data::class.declaredMemberProperties.forEach {
                    if (it.visibility == KVisibility.PUBLIC) {
                        result[it.name] = it.get(persistentData).toString()
                    }
                }
            }
        }
        return result
    }

    override fun getTestDataPath() = PluginTestCaseBase.getTestDataPathBase() + "/run/tests/"

    private fun setUpModulePaths(
        modulePath: String
    ) {
        val module = module(
            getTestName(true),
            moduleRootPath = modulePath
        )
        module.addLibrary(
            ForTestLibraries.junitJar,
            "junit"
        )

        runWriteAction {
            val moduleDir = LocalFileSystem.getInstance().findFileByIoFile(File(module.getModuleDir()))!!

            val outDir = moduleDir.createOrFindChildDir(this, "out")
            val srcOutDir = outDir.createOrFindChildDir(this, "production")
            val testOutDir = outDir.createOrFindChildDir(this, "test")


            PsiTestUtil.setCompilerOutputPath(module, srcOutDir.url, false)
            PsiTestUtil.setCompilerOutputPath(module, testOutDir.url, true)
        }
    }

    override fun tearDown() {
        ModuleRootModificationUtil.updateModel(module) { model ->
            model.clear()
        }
        super.tearDown()
    }
}


private fun VirtualFile.createOrFindChildDir(requestor: Any, name: String): VirtualFile {
    val child = findChild(name)
    return when {
        child == null -> createChildDirectory(requestor, name)
        child.isDirectory -> child
        else -> error("$child already exists and is not a directory")
    }
}

object ForTestLibraries {
    val junitJar = "libraries/lib/junit-4.11.jar".assertExists()

    private fun String.assertExists(): File {
        val file = File(this)
        if (!file.exists()) {
            throw IllegalStateException(file.toString() + " does not exist. Run 'ant dist'")
        }
        return file
    }
}