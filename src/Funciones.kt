fun main() {
   /* val greeting  = birthdayGereting()
    println("greeting = ${greeting}")*/
    println(birthdayGereting(age = 5))
    println(birthdayGereting(name ="Rex", age = 2))
}
//Unit es iguala a void en java, no retorna nada
/*fun birthdayGereting() :Unit {
    println("Happy Birthday¿,, Rover!")
    println("You are now 5 years old")
}*/
fun birthdayGereting(name: String = "Rover", age: Int) :String {
    return "Happy Birthday, $name! You are now $age years old"

}