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
    newTopic("Operaciones Básicas")
    val unreadCount: Int = 5
    val readCoutn: Int = 100
    println("You have ${unreadCount + readCoutn} total messages in your box")
    val numberOPhotos: Int = 100
    val photoDeleted: Int = 10
    println("${numberOPhotos} photos")
    println("${photoDeleted} photos deleted")
    println("${numberOPhotos - photoDeleted} photos left")
}