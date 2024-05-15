fun main() {
    newTopic("uso de la funcion print()")
    println("Use the val keyword when the value doesn't chnage")
    println("Use the var keyword the value can change")
    println("When you define a function, you define the parameters that can be passed to it")
    println("When you call a function , you pass for the paarameters")

    newTopic(topic = "Correción de error")
    println("New chat message from a friend")

    newTopic(topic = "Concatenación de String")
    val numberOfAdults = 20
    val numberOfKids = 30
    val  total = numberOfAdults + numberOfKids
    println("The total party sisze is: $total")
    newTopic("Formato de Mensajes")
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "${baseSalary + bonusAmount}"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    newTopic("Operaciones Matemáticas")
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber , secondNumber)
    val anotherResult = add(firstNumber , thirdNumber)
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    newTopic(topic = "Páramtros predeterminados")

    val firstUserEmailId = "sample@gmial.com"
    println(displayAlertMessage(emailId = firstUserEmailId))

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}



fun displayAlertMessage(operatingSystem: String = "Unknow OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId"
}

fun add(oneNumber: Int, twoNumber: Int) :Int {
    return oneNumber + twoNumber
}