package lesson7

fun main() {

    println(REQUEST_MESSAGE)
    val maxNumber = readln().toInt()

    for (i in 0..maxNumber step 2) println(i)

}

const val REQUEST_MESSAGE = "Введите максимальное число для списка чётных чисел:"