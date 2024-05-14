fun main() {
    /**
     * String ->
     * Int -> por defecto los numero que son decimal los toma ocmo decimal
     * Double -> por defecto si ponemos decimal los tomara como double
     * Float -> si hacemos uso del float debemos poner un "F" para especificarlo
     * Bolean -> true o flase == 0 es false, 1 = true
     * */

    newTopic("Doueble")
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    newTopic("String")

    val nextMeeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeeting + date + " at work"
    println(reminder)

    newTopic("secuerncias de escape")
    println("Say \"Hello\"")

    newTopic("Booleano")
    val notificatiopnsEnabled: Boolean = true
    println("Are notification enabled ?  ${notificatiopnsEnabled}")

}