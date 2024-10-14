package KotlinBase

fun main() {

    println("Введите число")
    val number = readln().toInt()
    for (i in 1 until number) {
        println(i * 2)
    }
}