package lesson5

fun main() {

    val firstNumber = (1..10).random()
    val secondNumber = (1..10).random()
    val sum = firstNumber + secondNumber

    println("Докажите, что вы не бот. Сколько будет $firstNumber + $secondNumber?")
    val userAnswer = readln().toInt()

    println (
        if (userAnswer == sum) ALLOWING_MESSAGE
        else PROHIBITING_MESSAGE
    )

}

const val ALLOWING_MESSAGE = "Добро пожаловать!"
const val PROHIBITING_MESSAGE = "Доступ запрещен."