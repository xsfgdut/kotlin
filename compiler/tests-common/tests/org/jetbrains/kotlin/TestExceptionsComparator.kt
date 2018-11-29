/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin

import com.intellij.rt.execution.junit.FileComparisonFailure
import org.junit.Assert
import org.jetbrains.kotlin.test.KotlinTestUtils
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.PrintStream
import java.lang.Error
import java.security.MessageDigest
import java.util.regex.Matcher
import java.util.regex.Pattern
import javax.xml.bind.DatatypeConverter

sealed class TestsError : Error() {
    abstract val original: Throwable
    abstract val postfix: TestsCompilerExceptionFilePostfix
}

enum class TestsCompilerExceptionFilePostfix(val text: String) {
    COMPILER_ERROR("compiler"),
    COMPILETIME_ERROR("compiletime"),
    RUNTIME_ERROR("runtime"),
}

class TestsCompilerError(override val original: Throwable) : TestsError() {
    override val postfix = TestsCompilerExceptionFilePostfix.COMPILER_ERROR
    override fun toString() = original.toString()
}
class TestsCompiletimeError(override val original: Throwable) : TestsError() {
    override val postfix = TestsCompilerExceptionFilePostfix.COMPILETIME_ERROR
    override fun toString() = original.toString()
}
class TestsRuntimeError(override val original: Throwable) : TestsError() {
    override val postfix = TestsCompilerExceptionFilePostfix.RUNTIME_ERROR
    override fun toString() = original.toString()
}

private enum class ExceptionType {
    ANALYZING_EXPRESSION,
    UNKNOWN
}

class TestExceptionsComparator(wholeFile: File) {
    companion object {
        private const val EXCEPTIONS_FILE_PREFIX = "exceptions"

        private val exceptionMessagePatterns = mapOf(
            ExceptionType.ANALYZING_EXPRESSION to
                    Pattern.compile("""Exception while analyzing expression at \((?<lineNumber>\d+),(?<symbolNumber>\d+)\) in /(?<filename>.*?)$""")
        )
        private val ls = System.lineSeparator()
    }

    private val filePathPrefix = "${wholeFile.parent}/${wholeFile.nameWithoutExtension}.$EXCEPTIONS_FILE_PREFIX"

    private fun analyze(e: Throwable): Matcher? {
        for ((_, pattern) in exceptionMessagePatterns) {
            if (e.message == null) continue
            val matches = pattern.matcher(e.message)
            if (matches.find()) return matches
        }

        return null
    }

    private fun getExceptionsFile(e: TestsError) = File("$filePathPrefix.${e.postfix.text}.txt")

    private fun reduceStackTrace(stackTrace: String): Pair<String, String> {
        val md = MessageDigest.getInstance("MD5")
        val digest = md.digest(stackTrace.toByteArray())
        val hash = "0x${DatatypeConverter.printHexBinary(digest)}"
        val reducedStackTrace = stackTrace.lines().subList(0, 10).joinToString(System.lineSeparator())

        return Pair(hash, reducedStackTrace)
    }

    private fun validateExistingExceptionFiles(e: TestsError?) {
        val postfixesOfFilesToCheck = TestsCompilerExceptionFilePostfix.values().toMutableSet()
        e?.let { postfixesOfFilesToCheck.remove(it.postfix) }
        postfixesOfFilesToCheck.forEach {
            if (File("$filePathPrefix.${it.text}.txt").exists())
                Assert.fail("No $it, but file $filePathPrefix.${it.text}.txt exist.")
        }
    }

    fun runAndCompareWithExpected(
        checkUnexpectedBehaviour: ((Matcher?) -> Boolean)? = null,
        muteOnCompilerExceptions: Boolean = false,
        runnable: () -> Unit
    ) {
        val exceptionsBuffer = ByteArrayOutputStream()
        val stream = PrintStream(exceptionsBuffer)

        System.setErr(stream)

        try {
            runnable()
        } catch (e: TestsError) {
            val exceptionInfo = analyze(e.original)

            if (e !is TestsCompilerError || checkUnexpectedBehaviour?.invoke(exceptionInfo) != false) {
                val exceptionsFile = getExceptionsFile(e)

                e.original.printStackTrace(stream)
                val (stackTraceHash, stackTrace) = reduceStackTrace(exceptionsBuffer.toString())

                try {
                    KotlinTestUtils.assertEqualsToFile(exceptionsFile, "STACK TRACE HASH: $stackTraceHash$ls$ls$stackTrace$ls...")
                } catch (e: FileComparisonFailure) {
                    if (!muteOnCompilerExceptions)
                        throw e
                }

                print(exceptionsBuffer.toString())
                e.original.printStackTrace()

                System.setErr(System.err)

                validateExistingExceptionFiles(e)

                return
            } else {
                throw e.original
            }
        }

        validateExistingExceptionFiles(null)
    }
}
