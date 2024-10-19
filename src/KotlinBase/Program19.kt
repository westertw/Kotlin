package KotlinBase

fun main() {


    // Словарь с днями недели и их номерами, ф-ия mapOf принимает набор элементов, каждый из которых сопоставляется с ключом
    val daysOfWeek = mapOf(
         "Понедельник" to 1,
        "Вторник" to 2,
        "Среда" to 3,
        "Четверг" to 4,
        "Пятница" to 5,
        "Суббота" to 6,
        "Воскресенье" to 7
    )

    // Выводим словарь
    for ((day, number) in daysOfWeek) {
        println("$day - $number")
    }
}