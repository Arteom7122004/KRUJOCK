

fun main(arch: Array<String>) {
    val bookOne: Book? = null
    val bookTwo: Book? = Book(1234, 13134)
    bookOne?.let{buy(publication = bookOne)}
    bookTwo?.let {buy(publication =  bookTwo)}

}


interface Publication {
    val price: Int
    val wordCount: Int
    fun getType(): String
}
class Book(override val price: Int, override val wordCount: Int) : Publication{
    override fun getType() =
        when {
            wordCount <= 1000 -> "Flash Fiction"
            wordCount <= 7500 -> "Short Story"
            else -> {
                "Novel"
            }
}
class Magazine(override val price: Int, override val wordCount: Int) : Publication{
    override fun getType() = "Magazine"
    }


}





fun buy (publication: Publication){
    println("The purchase is complete. The purchase amount was ${publication.price}")
}


