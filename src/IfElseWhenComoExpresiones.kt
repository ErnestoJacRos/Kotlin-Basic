fun main() {
    newTopic("When e If/Else como espresiones")
    val trafficLightColor = "Black"
    newTopic("If como expresión")
    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)

    newTopic("When como expresión")

    val lightColor = when (trafficLightColor){
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(lightColor)
}