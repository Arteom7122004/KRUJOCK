fun main(arch: Array<String>) {
    print("Введите имя и фамилию: ")
    var name = readLine()
    print("Введите возраст: ")
    val age = readLine()!!.toInt()
    if (age < 14) {
        println("Вызов полиции")
    }
    else if (age < 18) {
        println ("Невпускать $name")
    }
    else {
        println("Проход разрешён")
    }
}
