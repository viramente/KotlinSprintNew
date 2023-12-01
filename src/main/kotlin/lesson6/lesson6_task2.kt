package lesson6

fun main() {

    println("Укажите количество секунд, которые нужно засечь:")
    val orderedTimeInSeconds = readln().toInt()

    var counter = orderedTimeInSeconds

    do {
        Thread.sleep(1000)
        counter--
    } while (counter != 0)

    println("Прошло $orderedTimeInSeconds сек.")

}

