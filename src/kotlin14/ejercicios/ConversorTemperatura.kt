package kotlin14.ejercicios

fun main() {
    printFinalTemperature(27.0,"Celsius", "Fahrenheit"){9.0 / 5.0 * it +32}
    printFinalTemperature(350.0,"Celsius", "Fahrenheit"){it - 273.15}
    printFinalTemperature(10.0,"Celsius", "Fahrenheit"){5.0 / 9.0  * (it - 32) +273}
}
fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}