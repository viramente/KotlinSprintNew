package lesson6

fun main() {

    var counter = ATTEMPTS_AMOUNT

    while (counter-- > 0) {

        println(REQUEST_MESSAGE)

        val firstNumber = (0..9).random()
        val secondNumber = (0..9).random()

        println("Сколько будет $firstNumber + $secondNumber?")
        val usersAnswer = readln().toInt()

        if (usersAnswer == (firstNumber + secondNumber)) {
            println(SUCCESSFUL_MESSAGE)
            return
        }

        if (counter == 0) {
            println(UNSUCCESSFUL_MESSAGE)
            return
        }

        println("Неверно. Осталось попыток: $counter.")
    }
}

const val ATTEMPTS_AMOUNT = 3
const val REQUEST_MESSAGE = "Докажи, что ты не бот."
const val SUCCESSFUL_MESSAGE = "Добро пожаловать!"
const val UNSUCCESSFUL_MESSAGE = "Доступ запрещен."