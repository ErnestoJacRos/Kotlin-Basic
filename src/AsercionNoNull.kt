fun main() {
    /*Uso del operaodr de aserción no "nulo"
    * como suguiere el nombre, si usas la aserción no nula "!!"
    * significa que confirmas que el valor de la variable
    * no es "null", sin importar si lo es o no
    * a diferencia de los operadores de llamada segura, el uso del
    * operador aserción no nulo "!!" puede generar un error
    * NullPointerException si la variable anulable es reralmente null
    * */
    var favoriteActor: String? = "Sandra Oh"
    //var favoriteActor: String? = null
    println("favoriteActor!!.length = ${favoriteActor!!.length}")

    val lengthOfName =if (favoriteActor != null) {
        favoriteActor.length
    }else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName")
}