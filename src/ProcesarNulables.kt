fun main() {
    /*uso de opereador de llamada seguro*/
    /** permite un acceso más seguro a las variables nulables
     * ya que si llamamos a un método o instancia nuleable,+
     * tendremos una error compilación, para ello después d ela variable s
     * usamos un "?" que es el operdor de llamada seguro*/
    var favoriteColor: String? = null
    println("favoriteColor.length = ${favoriteColor?.length}")
    favoriteColor = "Sandra Oh"
    println("favoriteColor.length = ${favoriteColor?.length}")
}