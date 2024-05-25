package kotlin14

fun main() {
    sayHello()
    newTopic("Argumentos")
    println("Suma ->  ${sum(2,3)}")
    val a = 2
    val b = 3
    println("$a + $b -> ${sum(a = a, b = b)}")
    println("$a - $b -> ${sub(a = a, b = b)}")
}

private fun sayHello(): Unit {//Unit = void in other
    println("Hola Kotlin funciones")
}

fun sum(a: Int, b: Int): Int {
   //val c: Int = a + b
   // return c
    return a + b
}

fun sub(a: Int, b: Int) = a - b
