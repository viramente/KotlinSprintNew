package lesson7

fun main() {

    var password: String = ""
    val pairsLetterPlusNumberAmount = PASSWORD_LENGTH / 2

    val letters = ('a'..'z')
    val numbers = (0..9)

    for (i in 0..<pairsLetterPlusNumberAmount) {
        val randomLetter = letters.random()
        val randomNumber = numbers.random()
        password = password + randomLetter + randomNumber
    }

    println("Сгенерированный пароль: $password")

}

const val PASSWORD_LENGTH = 6