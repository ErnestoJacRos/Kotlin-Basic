package kotlin14

fun main() {
    newTopic("Sobrecarga de Métodos")
    showProduct("Soda", "10%")
    showProduct("Pan")
    showProduct("Caramelo", "15%")
    showProduct(name = "Jugo", validity = "15 de marzo")
}
fun showProduct(name: String, promo: String = "sin promoción", validity: String = "agotar existencias") {
    println("$name = $promo hasta $validity" )
}
