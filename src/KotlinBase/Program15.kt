package KotlinBase

fun main() {
    print("Введите длину массива: ")
    val size = readln().toInt()
    val array = IntArray(size)
    for (i in 0..< size) {
        print("Введите элемент ${i + 1}: ")
        array[i] = readln().toInt()
    }
    print("Введите длину нового массива: ")
    val newSize = readln().toInt()
    if (newSize != size) {
        println("Ошибка: длина нового массива должна быть такой же, как и исходного.")
        return
    }
    val newArray = IntArray(newSize)
    for (i in 0..< newSize) {               //цикл для копирования эл-ов из исходного массива в новый массив в обратном порядке
        newArray[i] = array[size - i - 1]
    }
    println("Новый массив: ${newArray.joinToString()}") // ф-ия объединяет элементы коллекции в строку
}