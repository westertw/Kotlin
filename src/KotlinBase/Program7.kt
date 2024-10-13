package KotlinBase

fun main() {

        println("Введите символ: ")
        val symbol = readLine()
        if (symbol != null) {
            println("Длина строки равна: ${symbol.length}")
        } else {
            println("Введенная строка имеет значение null") //не работет else
        }
    }
