package lesson10

fun main() {

    println("Придумайте логин:")
    val userLogin = readln()

    println("Придумайте логин:")
    val userPassword = readln()

    println(
        if (!checkRequirements(userLogin, userPassword)) {
            "Логин или пароль недостаточно длинные."
        } else "Добро пожаловать!"
    )

}

const val MIN_DATA_LENGTH = 4

fun checkRequirements(login: String, password: String): Boolean =
    login.length < MIN_DATA_LENGTH || password.length < MIN_DATA_LENGTH