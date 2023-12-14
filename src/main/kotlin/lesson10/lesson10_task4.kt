package lesson10

fun main() {

    println("Начинаем игру.")

    var usersWinsAmount = 0

    do {
        if (roundDice()) usersWinsAmount++
        println("Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\".")
    } while (readln().equals("Да", true))

    println("Ваших побед: $usersWinsAmount.")
}


fun rollDice() = (1..6).random()

fun roundDice(): Boolean {

    var isUsersVictory = false

    val computersRollResult = rollDice()
    println("Ходит компьютер, выпадает $computersRollResult.")

    val humansRollResult = rollDice()
    println("Ваш ход, выпадает $humansRollResult.")

    if (determineWinner(computersRollResult, humansRollResult) == HUMAN_WON)
        isUsersVictory = true

    return isUsersVictory
}


fun determineWinner(computersRollResult: Int, humansRollResult: Int): String {

    return when {
        humansRollResult > computersRollResult -> {
            println("Вы победили.")
            HUMAN_WON
        }

        humansRollResult < computersRollResult -> {
            println("Победил компьютер.")
            COMPUTER_WON
        }

        else -> {
            println("Ничья.")
            NO_WINNERS
        }
    }
}

const val COMPUTER_WON = "computer"
const val HUMAN_WON = "human"
const val NO_WINNERS = "no winners"