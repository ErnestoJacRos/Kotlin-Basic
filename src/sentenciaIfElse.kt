fun main() {
    val trafficLightColor: String = "Black"
    if (trafficLightColor == "Red"){
        println("Stop")
    } else if(trafficLightColor == "Yellow"){
        println("Slow")
    }else if(trafficLightColor == "Green"){
        println("Go")
    }else {
        println("Invalid traffic-light color")
    }
}