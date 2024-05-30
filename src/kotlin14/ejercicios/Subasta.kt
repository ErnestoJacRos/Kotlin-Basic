package kotlin14.ejercicios

fun main() {
    val winningBid  = Bid(5000, "Private Collector")
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}")
    println("Item B is solod at ${auctionPrice(null, 300)}")
}

class Bid constructor( val amount: Int, val bidder: String )


    fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
        return bid?.amount ?: minimumPrice
    }
