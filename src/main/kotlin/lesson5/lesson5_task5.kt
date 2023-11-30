package lesson5

fun main() {

    val rightListOfNumbers = List(3) { (0..42).random() }

    println(RULES_MESSAGE)

    println(FIRST_NUMBER_REQUEST)
    val usersFirstNumber = readln().toInt()

    println(SECOND_NUMBER_REQUEST)
    val usersSecondNumber = readln().toInt()

    println(THIRD_NUMBER_REQUEST)
    val usersThirdNumber = readln().toInt()

    val userListOfNumbers = listOf(usersFirstNumber, usersSecondNumber, usersThirdNumber)

    val matchedNumbersAmount = (userListOfNumbers intersect rightListOfNumbers).size

    println(
        when (matchedNumbersAmount) {
            3 -> THREE_NUMBERS_MATCHED
            2 -> TWO_NUMBERS_MATCHED
            1 -> ONE_NUMBER_MATCHED
            else -> NO_MATCHED_NUMBERS
        }
    )

    val finalMessage = "Выигрышными числами были: ${rightListOfNumbers[0]}, " +
            "${rightListOfNumbers[1]}, ${rightListOfNumbers[2]}"

    println(finalMessage)

}

const val RULES_MESSAGE = "В этой лотерее вам нужно угадать три числа от 0 до 42."

const val FIRST_NUMBER_REQUEST = "Введите первое число и нажмите Enter:"
const val SECOND_NUMBER_REQUEST = "Введите второе число и нажмите Enter:"
const val THIRD_NUMBER_REQUEST = "Введите третье число и нажмите Enter:"

const val THREE_NUMBERS_MATCHED = "Вы угадали все числа... и выиграли джекпот!"
const val TWO_NUMBERS_MATCHED = "Вы угадали два числа... и получаете крупный приз!"
const val ONE_NUMBER_MATCHED = "Вы угадали одно число... и вам будет выплачен утешительный приз!"
const val NO_MATCHED_NUMBERS = "Вы не не угадали ни одного числа."