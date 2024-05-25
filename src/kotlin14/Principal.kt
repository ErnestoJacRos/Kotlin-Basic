package kotlin14

fun main() {
   // println("Hola Mundo")
    newTopic("Hola Kotlin")

    newTopic("Variables y constantes")
    //val a = 2
    //val a = "Hola"
    val a = true
    //var b= 2
    var b: Int
    b =5
    println("a = ${a}")
    println("b = ${b}")
    newTopic("Nulos")
    var objNull: String?
    objNull = null
    objNull = "Hi"
    println("objNull = ${objNull}")
    newTopic("Any")
    var objAny: Any?
    objAny = "Ernesto"
    objAny = 45
    objAny = 45.0f
    objAny = 454545554544545646L
    objAny = 64586450.54
    println("objAny = ${objAny}")
}
fun newTopic(topic: String) {
    println("=========== $topic ============")
}