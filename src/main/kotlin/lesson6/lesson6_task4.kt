package lesson6

fun main() {

    val determinedNumber = (0..9).random()

    println("Вам нужно угадать число от 0 до 9 за пять попыток.")

    var attemptsCounter = 5

    while (attemptsCounter > 0) {

        println("Введите число:")
        val usersGuessNumber = readln().toInt()
        attemptsCounter--

        if (usersGuessNumber == determinedNumber) {
            attemptsCounter = 0
            println("Вы угадали! Это была великолепная игра!")
        } else if (attemptsCounter == 0) {
            println("К сожалению, вам не удалось угадать число. Было загадано число $determinedNumber.")
        } else {
            println("К сожалению, число неверное. Осталось попыток: $attemptsCounter.")
        }
    }
}