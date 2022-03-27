fun main(arch: Array<String>) {
    var i=1
    val a = mutableListOf<User>()
    while(i<5){
        a[i] = User(name=(readLine().toString()), surName = (readLine().toString()), age = (readLine()!!.toInt()))
        i = i+1
    }
    println(a)
}

data class User(
    var name: String,
    var surName: String,
    var age: Int
)