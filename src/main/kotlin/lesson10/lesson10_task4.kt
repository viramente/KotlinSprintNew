package lesson10

fun main() {

    println("Начинаем игру.")

    var usersWinsAmount = 0
    var isIntentionToAnotherRound = true

    while (isIntentionToAnotherRound) {

        if (roundDice()) usersWinsAmount++

        println("Хотите бросить кости еще раз? Введите \"Да\" или \"Нет\".")
        isIntentionToAnotherRound = readln().equals("Да", true)
    }
    println("Ваших побед: $usersWinsAmount.")
}


fun rollDice() = (1..6).random()

fun roundDice(): Boolean {

    var isUsersVictory = false

    val computersRollResult = rollDice()
    println("Ходит компьютер, выпадает $computersRollResult.")

    val humansRollResult = rollDice()
    println("Ваш ход, выпадает $humansRollResult.")

    when {
        humansRollResult > computersRollResult -> {
            println("Вы победили.")
            isUsersVictory = true
        }

        humansRollResult < computersRollResult -> println("Победил компьютер.")

        else -> println("Ничья.")
    }

    return isUsersVictory
}