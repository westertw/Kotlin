package KotlinBase

fun main() {
    println("Введите первое множество")
    val n1 = readln().toInt()
    val set1 = mutableSetOf<String>() //ф-ия, для хранения эл-ов 1 набора

    for (i in 1..n1) {
        val element = readln()
        set1.add(element)
    }

    println("Введите второе множество")
    val n2 = readln().toInt()
    val set2 = mutableSetOf<String>()

    for (i in 1..n2) {
        val element = readln()
        set2.add(element)
    }

    val union = set1.union(set2) //ф-ия для создания нового набора, содержащего все

    println("Объединение ")
    for (element in union) {
        println(element)
    }
}