package lesson6

fun main() {

    println("Укажите количество секунд, которые нужно засечь:")
    val orderedTimeInSeconds = readln().toLong()
    val orderedTimeInMilliseconds = orderedTimeInSeconds * MILLISECONDS_IN_SECOND

    Thread.sleep(orderedTimeInMilliseconds)

    println("Прошло $orderedTimeInSeconds сек.")

}

const val MILLISECONDS_IN_SECOND = 1000