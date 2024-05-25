package kotlin14

fun main() {
    newTopic("Bubles")
    showPerson("Angel","Mary", "Fany")
    newTopic("con vararg")
    showPerson("Angel","Mary", "Sergio", "Alex")

}
fun showPerson(p1: String, p2: String, p3: String): Unit {
    println(p1)
    println(p2)
    println(p3)
}

fun showPerson(vararg perosns: String ) {
    
}