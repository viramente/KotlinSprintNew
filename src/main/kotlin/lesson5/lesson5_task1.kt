package lesson5

fun main() {

    val firstNumber = (1..10).random()
    val secondNumber = (1..10).random()
    val sum = firstNumber + secondNumber

    println("Докажите, что вы не бот. Сколько будет $firstNumber + $secondNumber?")
    val userAnswer = readln().toInt()

    val allowingMessage = "Добро пожаловать!"
    val prohibitingMassage = "Доступ запрещен."

    println (
        if (userAnswer == sum) allowingMessage
        else prohibitingMassage
    )

}