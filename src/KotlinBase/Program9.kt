package KotlinBase

fun main() {


    println("Введите ваше число")
    val number = readln().toIntOrNull()
    if (number == null) {
        println("Введено некорректное значение")
    } else {
        if (number % 2 == 0) {
            println("Ваше число является четным")
        } else {
            println("Ваше число является не четным")
        }
    }
}
