

fun main(arch: Array<String>) {
    var C: Book? = null
    var D: Book? = Book()
    C?.let{buy(price = C.price)}
    D?.let{buy(price = D.price)}
    var a = readLine()!!.toString()
    var price = readLine()!!.toDouble()
    var wordCount = readLine()!!.toInt()
    getType(a = a,price=price, wordCount=wordCount)
     buy(price=price)
}


interface Publication {
    var price: Double
    var wordCount: Int
}
class Book: Publication{
    override var price = readLine()!!.toDouble()
    override var wordCount = readLine()!!.toInt()
}
class Magazine: Publication{
    override var price: Double = readLine()!!.toDouble()
    override var wordCount: Int = readLine()!!.toInt()


}

fun getType(a: String, price: Double, wordCount: Int) {
    if (a == "Book"){
        if (wordCount <= 1000) {
            println("Flash Fiction")
        }
        else {
            if (wordCount <= 7500){
                println("Short Story")
            }
            else println("Novel")
        }
    }
    else println("Magazine")


}
fun buy (price: Double){
    println("The purchase is complete. The purchase amount was $price")

}

