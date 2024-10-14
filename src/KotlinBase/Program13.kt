package KotlinBase

fun main() {

    println("Введите число для обратного отсчета")
    val number = readln().toInt()
    if (number <= 0) {
        println("Значение должно быть положительным")
        return
    }
    for (i in number downTo  1){
        println("Обратный отсчет $i")

    }
}