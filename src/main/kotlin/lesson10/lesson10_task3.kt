package lesson10

fun main() {

    println("Укажите длину пароля:")
    val passwordLength = readln().toInt()

    println(createPassword(passwordLength))

}

fun getRandomNumber() = (0..9).random()
fun getRandomSpecialSymbol() = (' '..'/').random()


fun createPassword(passwordLength: Int): String {

    var password: String = ""

    for (i in 0..<passwordLength / 2) {
        password += getRandomNumber()
        password += getRandomSpecialSymbol()
    }

    return (if (passwordLength % 2 == 0) {
        password
    } else {
        password + getRandomNumber()
    }
            )
}