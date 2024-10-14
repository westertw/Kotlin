package KotlinBase

fun main() {

    val lines = mutableListOf<String>() // пустой список для хранения строк
    for (i in 1..5) {
        print("Введите $i строку: ") // цикл для ввода строк
        lines.add(readln())
    }
    val union = lines.joinToString(separator = "") //функция для объединения строк, separator задает разделитель между эл-ми
    println("Объединенные строки: $union")
}