package lesson6

fun main() {

    val determinedNumber = (0..9).random()

    println(RULES_MESSAGE)

    var counter = ATTEMPTS_NUMBER

    while (counter > 0) {

        println(REQUEST_MESSAGE)
        val usersGuessNumber = readln().toInt()
        counter--

        if (usersGuessNumber == determinedNumber) {
            counter = 0
            println(SUCCESSFUL_MESSAGE)
        } else if (counter == 0) {
            println("К сожалению, вам не удалось угадать число. Было загадано число $determinedNumber.")
        } else {
            println("К сожалению, число неверное. Осталось попыток: $counter.")
        }
    }
}

const val RULES_MESSAGE = "Вам нужно угадать число от 0 до 9 за пять попыток."
const val SUCCESSFUL_MESSAGE = "Вы угадали! Это была великолепная игра!"
const val REQUEST_MESSAGE = "Введите число:"
const val ATTEMPTS_NUMBER = 5