package lesson7

fun main() {

    println(MAX_PASSWORD_LENGTH_REQUEST)
    val maxPasswordsLength = readln().toInt()

    val passwordsLength = (MIN_PASSWORD_LENGTH..maxPasswordsLength).random()
    var password = ""

    for (order in 1..passwordsLength) {

        val type = (1..3).random()

        val symbolForAdding = when (type) {
            1 -> ('a'..'z').random()
            2 -> ('A'..'Z').random()
            3 -> (0..9).random().digitToChar()
            else -> ','
        }

        password += symbolForAdding

    }

    println("Сгенерированный пароль: $password.")

}

const val MAX_PASSWORD_LENGTH_REQUEST = "Укажите максимальную длину пароля (минимум 6 символов):"
const val MIN_PASSWORD_LENGTH = 6