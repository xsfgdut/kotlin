
inline fun <R, T> foo(x : R, y : R, block : (R, R) -> T) : T {
    return block(x, y)
}

fun bar() {
    foo(1, 2) { x, y -> x + y }
    foo(1L, 2L) { x, y -> x + y }
    foo(1f, 2f) { x, y -> x + y }
    foo(1.toDouble(), 2.toDouble()) { x, y -> x + y }
    foo(1.toByte(), 2.toByte()) { x, y -> x + y }
    foo(1.toShort(), 2.toShort()) { x, y -> x + y }
    foo('a', 'b') { x, y -> x == y }
    foo(true, false) { x, y -> x || y }
}

// 0 valueOf
// 0 Value\s\(\)
// 1 LOCALVARIABLE x I (.*) 5
// 1 LOCALVARIABLE y I (.*) 4
// 1 LOCALVARIABLE x J (.*) 24
// 1 LOCALVARIABLE y J (.*) 10
// 1 LOCALVARIABLE x F (.*) 19
// 1 LOCALVARIABLE y F (.*) 12
// 1 LOCALVARIABLE x D (.*) 27
// 1 LOCALVARIABLE y D (.*) 13
// 1 LOCALVARIABLE x B (.*) 20
// 1 LOCALVARIABLE y B (.*) 15
// 1 LOCALVARIABLE x S (.*) 21
// 1 LOCALVARIABLE y S (.*) 16
// 1 LOCALVARIABLE x C (.*) 22
// 1 LOCALVARIABLE y C (.*) 17
// 1 LOCALVARIABLE x Z (.*) 23
// 1 LOCALVARIABLE y Z (.*) 18
