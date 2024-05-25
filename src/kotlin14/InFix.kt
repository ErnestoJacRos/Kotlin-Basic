package kotlin14

import kotlin.math.abs

fun main() {
    newTopic("Infix")
    val a  = 2
    var c = -3
    println(c.enableAbs(false))

    println("$a + $c = ${sum(a,c)}")
    println("$a + $c = ${sum(a,c.enableAbs(true))}")
}
infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this