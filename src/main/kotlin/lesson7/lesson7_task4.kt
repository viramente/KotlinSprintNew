package lesson7

fun main() {

    println("Сколько секунд надо засечь?")
    val seconds = readln().toInt()

    for (each in seconds downTo 1) {
        println("До конца осталось: $each сек.")
        Thread.sleep(1000)
    }

    println("Время вышло.")
}