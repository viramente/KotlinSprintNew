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

    if (determineWinner(computersRollResult, humansRollResult) == "human")
        isUsersVictory = true

    return isUsersVictory
}


fun determineWinner(computersRollResult: Int, humansRollResult: Int): String {

    return when {
        humansRollResult > computersRollResult -> {
            println(HUMAN_WON)
            "human"
        }

        humansRollResult < computersRollResult -> {
            println(COMPUTER_WON)
            "computer"
        }

        else -> {
            println(NO_WINNERS)
            "no winners"
        }
    }
}

const val COMPUTER_WON = "Победил компьютер."
const val HUMAN_WON = "Вы победили."
const val NO_WINNERS = "Ничья."