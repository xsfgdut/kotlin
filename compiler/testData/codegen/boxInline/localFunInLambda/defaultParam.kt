// FILE: 1.kt

inline fun <T> run(c: () -> T): T = c()

// FILE: 2.kt
// NO_CHECK_LAMBDA_INLINING

fun fooInt(): String {
    val r = "O"
    val a = run {
        fun f(x: Int, y: String? = null): String = r + x + y
        f(1, "K")
    }
    return a
}

fun fooLong(): String {
    val r = "O"
    val a = run {
        fun f(x: Long, y: String? = null): String = r + x + y
        f(2, "K")
    }
    return a
}

fun box(): String {
    var res = fooInt()
    if (res != "O1K") return res
    res = fooLong()
    if (res != "O2K") return res
    return "OK"
}