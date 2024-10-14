package KotlinBase

fun main() {
    print("Введите количество элементов массива: ")
    val size = readln().toInt()
    val array = IntArray(size)
    for (i in 0..< size) {
        print("Введите элемент ${i + 1}: ")
        array[i] = readln().toInt()
    }
    print("Введите число для поиска: ")
    val target = readln().toInt()
    val found = array.contains(target) // ф-ия, для проверки наличия целевого числа в массиве
    println("Результат: $found")
}