package KotlinBase

fun main() {

    println("Введите ваш возраст")
    val age = readln().toIntOrNull() // ф-ия, для преобразования строк в числовые значения
    if (age == null) {  //проверка на ввод пустого значения
        println("Введено некорректное значение")
    } else if (age < 0) {
        println("Введено некорректное значение")
    } else if (age < 18) {
        println("Несовершеннолетний")
    } else {
        println("Совершеннолетний")
    }
}


//    when (age) {
//    null -> println("Введено некорректное значение")
//    in 0 until 18 -> println("Несовершеннолетний")
//    else -> println("Совершеннолетний")
//    }