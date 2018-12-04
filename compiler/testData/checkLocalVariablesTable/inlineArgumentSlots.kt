inline fun require(value: Boolean, lazyMessage: () -> Any) {
    if (!value) {
        val message = lazyMessage()
        throw IllegalArgumentException(message.toString())
    }
}

class A {
    fun test(): String {
        val a = 1F
        val b = 1F
        val c = 1F
        require(a + b < c) {
            "Something wrong $a + $b < $c"
        }
        val size = a + b
        require(a + b < c) {
            "Something wrong $a + $b < $c"
        }
        val size2 = a + b
        require(size2 - size < 1) {
            "Something wrong $a + $b < $c"
        }
        return "OK"
    }
}

fun box() = A().test()

// METHOD : A.test()Ljava/lang/String;
// VARIABLE : NAME=$i$a$1$require TYPE=I INDEX=5
// VARIABLE : NAME=message$iv TYPE=Ljava/lang/Object; INDEX=6
// VARIABLE : NAME=value$iv TYPE=Z INDEX=4
// VARIABLE : NAME=$i$f$require TYPE=I INDEX=7
// VARIABLE : NAME=$i$a$2$require TYPE=I INDEX=13
// VARIABLE : NAME=message$iv TYPE=Ljava/lang/Object; INDEX=15
// VARIABLE : NAME=value$iv TYPE=Z INDEX=11
// VARIABLE : NAME=$i$f$require TYPE=I INDEX=8
// VARIABLE : NAME=$i$a$3$require TYPE=I INDEX=16
// VARIABLE : NAME=message$iv TYPE=Ljava/lang/Object; INDEX=17
// VARIABLE : NAME=value$iv TYPE=Z INDEX=14
// VARIABLE : NAME=$i$f$require TYPE=I INDEX=9
// VARIABLE : NAME=size2 TYPE=F INDEX=12
// VARIABLE : NAME=size TYPE=F INDEX=10
// VARIABLE : NAME=c TYPE=F INDEX=3
// VARIABLE : NAME=b TYPE=F INDEX=2
// VARIABLE : NAME=a TYPE=F INDEX=1
// VARIABLE : NAME=this TYPE=LA; INDEX=0