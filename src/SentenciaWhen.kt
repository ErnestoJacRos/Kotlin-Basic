fun main() {

    newTopic("Sentencia When")
    val trafficLightColor = "Ambar"
    when(trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Ambar" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid Traffci-light color")
    }
    newTopic("When con \",\" , \"in\" de rango e \"is\" de type con la variable del tipo \"Any\" ")

    val x: Any = 20
    when(x) {
        2, 3, 5, 7  -> println("x is a prime number between 1 amd 10")
        in 1..10 -> println("x is a number between 1 and 10, but not a number prime.")
        is Int -> println("x is a integer number, but not between 1 and 10")
        else -> println("x isn't aprime number between 1 and 10")
    }

}
