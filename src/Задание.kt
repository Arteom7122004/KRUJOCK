fun main(arch: Array<String>) {
    var names: Array<String> = arrayOf(" ", " ", " "," " ," " )
    var i: Int = 0
    while (i <= 4) {
    print("Введите имя и фамилию: ")
    var name = readLine().toString()
    print("Введите возраст: ")
    val age = readLine()!!.toInt()
    if (age >= 18) {
        names[i] = name
        i = i + 1

    }
    }
    println(names.contentToString())
}
