package KotlinBase


fun main() {

    println("Введите количество элементов первого множества:")
    val n = readln().toIntOrNull() ?: return
    val firstSet = mutableSetOf<String>()

    println("Введите элементы первого множества (каждый на новой строке):")
    repeat(n) {
        val element = readLine()?.trim()
        if (element != null) {
            firstSet.add(element)
        }
    }

    println("Введите количество элементов второго множества:")
    val m = readln().toIntOrNull() ?: return
    val secondSet = mutableSetOf<String>()

    println("Введите элементы второго множества (каждый на новой строке):")
    repeat(m) {
        val element = readLine()?.trim()
        if (element != null) {
            secondSet.add(element)
        }
    }

    // Находим общие элементы
    val commonElements = firstSet.intersect(secondSet)

    // Выводим результат
    println("Общие элементы:")
    if (commonElements.isNotEmpty()) {
        for (element in commonElements) {
            println(element)
        }
    } else {
        println("Нет общих элементов.")
    }
}