package kotlin14.ejercicios

fun main() {
    val morningNotifications = 51
    val eveningNotifications = 135

    printNotificationsSummary(morningNotifications)
    printNotificationsSummary(eveningNotifications)
}

fun printNotificationsSummary(numberOfMessages: Int) {
    if (numberOfMessages > 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else {
        println("You have $numberOfMessages notifications")
    }
}
