package KotlinBase


fun main() {
    val word = "maxim"
    val unicode = word.codePointAt(0)
    println("Ваше слово в Unicode: '$word' = $unicode")

    val number = "45"
    val decode = number.toInt()
    println("Ваше число в Unicode: '$number' = $decode")

}

