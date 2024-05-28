package kotlin14

fun main() {
    //function reference operator "::"
    // val trickFunction = :: trick
    /*val trickFunction = trick
    trickFunction()
    treat()*/
    /*val coins: (Int) -> String = {
        quantity -> "$quantity quarters"
    }*/
    //solo es un parametro no es necesario poner el nombre y
    //podmeos sustituirlo por "it"
    val coins: (Int) -> String = {
             "$it quarters"
    }
    /*val cupcake: (Int) -> String = {
        "Have a cupcake"
    }*/
    //val treatFunction = trickOrTreat(false, coins)
    //pasmaos la función directamente
     val treatFunction = trickOrTreat(false, {"$it quarters"})
    //vairente de null
    //val treatFunction = trickOrTreat(false, null)
    val trickFunction = trickOrTreat(true){"$it quarters"}

    repeat(4){
        treatFunction()
    }
    treatFunction()
    trickFunction()
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
    println("No treats")
}

private val treat: () -> Unit = {
    println("Have a treat!")
}