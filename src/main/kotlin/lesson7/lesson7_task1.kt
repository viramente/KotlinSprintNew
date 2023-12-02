package lesson7

fun main() {

    var password: String = ""
    val pairsLetterPlusNumberAmount = PASSWORD_LENGTH / 2

    for (i in 0..<pairsLetterPlusNumberAmount) {
        val randomLetter = ('a'..'z').random()
        val randomNumber = (0..9).random()
        password = password + randomLetter + randomNumber
    }

    println("Сгенерированный пароль: $password")

}

const val PASSWORD_LENGTH = 6