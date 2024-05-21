fun main() {
    /**
     * La nulabilidad es un concepto encontrado en varios lengujaes
     * se refiere a la capacidad de las variables de tener una ausencia
     * valor
     * los tipos anulables son las variables que pueden contener "null"
     * los tipos no nulos son variables que no pueden contener "null"
     * */

    /*para los nulables debes agregar el operador "?" al final del
    * tipo ejemplo: String? asi que puede contener un String y un "null"
    *   */
    newTopic("Nulables")
    var favoriteActor: String? = "SandraOh"
    println("favoriteActor = ${favoriteActor}")
    favoriteActor = null
    println("favoriteActor = ${favoriteActor}")

    var number: Int? = 10
    println("number = ${number}")
    number = null
    println("number = ${number}")
}