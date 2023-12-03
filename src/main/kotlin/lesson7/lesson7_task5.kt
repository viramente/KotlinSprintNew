package lesson7

fun main() {

    println("Укажите максимальную длину пароля (минимум $MIN_PASSWORD_LENGTH символов):")
    val maxPasswordsLength = readln().toInt()

    val passwordsLength = (MIN_PASSWORD_LENGTH..maxPasswordsLength).random()
    var password = ""

    val symbolsRange = ('A'..'Z').joinToString("") +
            ('a'..'z').joinToString("") +
            ('0'..'9').joinToString("")

    for (order in 1..passwordsLength) {
        val symbolForAdding = symbolsRange.random()
        password += symbolForAdding
    }

    println("Сгенерированный пароль: $password.")

}

const val MIN_PASSWORD_LENGTH = 6