package KotlinBase

fun main() {

    println("Введите элементы списка через запятую:")
    val input = readln()

    // Разделяем строку по запятой и создаем список
    val items = input.split(",").map { it.trim() }

    // Создаем Map, подсчитывая количество вхождений каждого элемента
    val itemCountMap = items.groupingBy { it }.eachCount()

    println("Результат:")
    for ((item, count) in itemCountMap) {
        println("$item - $count")
    }
}