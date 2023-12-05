package lesson6

fun main() {

    val determinedNumber = (0..9).random()

    var attemptsCounter = 5

    println("Вам нужно угадать число от 0 до 9 за $attemptsCounter попыток.")

    while (attemptsCounter-- > 0) {
        println("Введите число:")
        val usersGuessNumber = readln().toInt()

        if (usersGuessNumber == determinedNumber) {
            println("Вы угадали! Это была великолепная игра!")
            return
        }

        println("Число неверное. Осталось попыток: $attemptsCounter.")
    }

    println("К сожалению, вам не удалось угадать число. Было загадано число $determinedNumber.")
}