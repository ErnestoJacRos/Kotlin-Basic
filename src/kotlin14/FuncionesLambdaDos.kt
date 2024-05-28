package kotlin14

fun main() {
    // se hace una referencia a una función como un valor(sin parentesis)
    //usamos el operador de referencia de función "::"
    /*val trickFunction =  trick2
    trickFunction()
    trick2()
    treat2()*/
    /*val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }*/
    //el nombre del parámetro lo sustituimos con "it" ya que solo es un argumento
    val coins: (Int) -> String = {
        "$it quarters"
    }
    val cupcake: (Int) -> String = {
        "Have a cupcake"
    }
    /*val treatFunction = trickOrTreat(false, coins)*/
    //val treatFunction = trickOrTreat(false, {"$it quarters"})
    val treatFunction = trickOrTreat(false) { "$it quarters" }
    val trickFunction = trickOrTreat(true,/* cupcake*/null)

    trickFunction()
    repeat(4) {
        treatFunction()
    }

}

private fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}

private val trick = {
    println("no treats")
}
private val treat: () -> Unit = {
    println("Have a treat!")
}

/*
fun add(a: Int, b: Int): Int {
    return a + b
}
val addLambda: (Int, Int) -> Int ={
    a, b -> a + b
}*/
