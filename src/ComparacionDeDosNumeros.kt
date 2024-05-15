fun main() {
    println(timeSpend(300,250))
    println(timeSpend(300,300))
    println(timeSpend(200,220))
}
fun timeSpend(timeToday: Int, timeTomorrow: Int) :Boolean {
    if (timeToday > timeTomorrow){
        return true
    }else{
        return false
    }
}