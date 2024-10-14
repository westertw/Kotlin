package KotlinBase

import java.util.Scanner

fun dayOfWeek(day: Int): String {
    return when (day) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресенье"
        else -> "Неверный ввод"
    }
}

fun main() {

    val scanner = Scanner(System.`in`)
    println("Введите число от 1 до 7")
    val input = scanner.nextInt()
    val dayWeek = dayOfWeek(input)
    println("День недели: $dayWeek")
}