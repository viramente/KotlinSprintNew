package lesson10

fun main() {

    println("Укажите ваш логин:")
    val login = readln()

    println("Укажите ваш пароль:")
    val password = readln()

    val token = authorizeAndGetToken(login, password)

    if (token == null) {
        println("Авторизация не была успешной.")
    }
    else {
        println("Ваша корзина:")
        getBasket(token)!!.forEach { println(it) }
    }
}

const val TOKEN_LENGTH = 32
const val REGISTERED_LOGIN = "sunrise"
const val REGISTERED_PASSWORD = "tomorrow"

fun randomSymbol() = (('0'..'9') + ('A'..'Z') + ('a'..'z')).random()

fun authorizeAndGetToken(login: String, password: String): String? {
    return if (login == REGISTERED_LOGIN && password == REGISTERED_PASSWORD) {
        ((Array(TOKEN_LENGTH) { randomSymbol() }).joinToString(""))
    } else null
}

fun getBasket(token: String): List<String> {
    return listOf("туфли", "куртка", "шапка", "шарф")
}