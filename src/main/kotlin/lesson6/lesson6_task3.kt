package lesson6

fun main() {

    println(ALARM_SET_MESSAGE)
    val orderedTimeInSeconds = readln().toInt()

    var counter = orderedTimeInSeconds
    println("Осталось: $counter сек.")

    while (counter > 0) {
        Thread.sleep(1000)
        counter--

        if (counter > 0) {
            println("Осталось: $counter сек.")
        }
    }
    println(ALARM_MESSAGE)
}

const val ALARM_SET_MESSAGE = "Укажите количество секунд, которые нужно засечь:"
const val ALARM_MESSAGE = "Время вышло."