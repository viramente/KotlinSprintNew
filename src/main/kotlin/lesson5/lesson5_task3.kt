package lesson5

fun main() {

    println("Ваша задача — угадать два числа от 0 до 42.")

    println("Введите первое число:")
    val firstNumber = readln()

    println("Введите второе число:")
    val secondNumber = readln()

    val mainPrizeCondition =
        ((firstNumber == SECOND_RIGHT_NUMBER) &&
            (secondNumber == FIRST_RIGHT_NUMBER)) ||
            (secondNumber == SECOND_RIGHT_NUMBER) &&
            (firstNumber == FIRST_RIGHT_NUMBER)
    val consolationPrizeCondition =
        ((firstNumber == SECOND_RIGHT_NUMBER) ||
                (firstNumber == FIRST_RIGHT_NUMBER)) ||
                (secondNumber == SECOND_RIGHT_NUMBER) ||
                (secondNumber == FIRST_RIGHT_NUMBER)

    println (when {
        mainPrizeCondition -> MAIN_PRIZE_MESSAGE
        consolationPrizeCondition -> CONSOLATION_PRIZE_MESSAGE
        else -> NO_PRIZE_MESSAGE
    })

    println("Для победы нужно было ввести числа: $FIRST_RIGHT_NUMBER и $SECOND_RIGHT_NUMBER.")
}

const val FIRST_RIGHT_NUMBER = "17"
const val SECOND_RIGHT_NUMBER = "36"
const val MAIN_PRIZE_MESSAGE = "Поздравляем! Вы выиграли главный приз!"
const val CONSOLATION_PRIZE_MESSAGE = "Вы выиграли утешительный приз!"
const val NO_PRIZE_MESSAGE = "Неудача!"