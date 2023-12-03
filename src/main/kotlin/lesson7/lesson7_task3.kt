package lesson7

fun main() {

    println("Введите максимальное число для списка чётных чисел:")
    val maxNumber = readln().toInt()

    for (i in 0..maxNumber step 2) println(i)

}