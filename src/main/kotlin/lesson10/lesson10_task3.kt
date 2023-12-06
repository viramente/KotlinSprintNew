package lesson10

fun main() {

    println("Укажите длину пароля:")
    val passwordLength = readln().toInt()

    println(createPassword(passwordLength))

}

fun getRandomNumber() = (0..9).random().digitToChar()
fun getRandomSpecialSymbol() = (' '..'/').random()


fun createPassword(passwordLength: Int): String {

    val password = mutableListOf<Char>()

    for (i in 0..<passwordLength / 2) {
        password.add(getRandomNumber())
        password.add(getRandomSpecialSymbol())
    }

    return (if (passwordLength % 2 == 0) {
        password.joinToString("")
    } else {
        (password + getRandomNumber()).joinToString("")
    }
            )
}