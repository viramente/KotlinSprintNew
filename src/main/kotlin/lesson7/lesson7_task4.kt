package lesson7

fun main() {

    println(REQUEST_MESSAGE)
    val seconds = readln().toInt()

    for (each in seconds downTo 1) {
        println("До конца осталось: $each сек.")
        Thread.sleep(1000)
    }

    println(FINAL_MESSAGE)
}

const val REQUEST_MESSAGE = "Сколько секунд надо засечь?"
const val FINAL_MESSAGE = "Время вышло."