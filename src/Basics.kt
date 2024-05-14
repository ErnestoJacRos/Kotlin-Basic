fun newTopic(topic: String) {
    println("===========$topic===================")
}
fun main() {
    newTopic("Funciones")
    println("Hello Kotlin")
    println("Ernesto")
    newTopic(topic = "Variables")
    val count: Int  = 10
    println("You have $count count unread messages")
}