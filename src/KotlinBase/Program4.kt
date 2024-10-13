package KotlinBase

fun main() {
    println("Введите символ")
    val low = readLine()!![0]
    val up = low.toUpperCase() // ф-ия преобразует указанный символ в верхний регистр с помощью Unicode
    val unicode = up.toInt()
    println("Код нового символа: '$up' = $unicode")

}