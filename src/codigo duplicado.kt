fun main() {

    infoClima("Ankara", 27, 31, 82)
    infoClima("Tokyo", 32, 36, 10)
    infoClima("Cape Town", 59, 64, 2)
    infoClima("Guatemale City", 50, 50, 7)
}

fun infoClima(city: String, lowTemp: Int, highTemp: Int, rain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rain%")
    println()
}