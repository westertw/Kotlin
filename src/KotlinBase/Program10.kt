package KotlinBase

fun main() {

    println("Введите ваш возраст")
    val age = readLine()!!.toIntOrNull()
    if (age == 0) {
        println("Введено некорректное значение")
    } else if (age in 0..12) {
        println("Вы ребенок")
    } else if (age in 13..17) {
        println("Вы подросток")
    } else if (age in 18..64) {
        println("Вы взрослый")
    } else if (age in 65..120){
        println("Вы пожилой")
    } else {
        println("Некорректный возраст")
    }
}