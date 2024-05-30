package kotlin14.ejercicios

fun main() {
    val cancion = Song("Yet Back","The Beatles", 1980, 100)
    cancion.printSongInfo()
    println("Es popular ?-> ${cancion.isPopular}")
}

class Song constructor(
    val title: String,
    val artits: String,
    val year: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printSongInfo() {
        println("\"$title, interpretada por $artits, se lanzó en $year\".")
    }
}

