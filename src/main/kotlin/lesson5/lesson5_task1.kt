package lesson5

fun main() {

    println("Докажите, что вы не бот. Сколько будет 5 + 6?")
    val userAnswer = readln()
    val allowingMessage = "Добро пожаловать!"
    val prohibitingMassage = "Доступ запрещен."
    println (if (userAnswer == RIGHT_ANSWER) allowingMessage else prohibitingMassage)

}

const val RIGHT_ANSWER = "11"