package lesson6

fun main() {

    println(LOGIN_CREATE)
    val usersLogin = readln()

    println(PASSWORD_CREATE)
    val usersPassword = readln()

    do {
        println(LOGIN_REQUEST)
        val loginForCheckIn = readln()

        println(PASSWORD_REQUEST)
        val passwordForCheckIn = readln()
    } while ((usersLogin != loginForCheckIn) || (usersPassword != passwordForCheckIn))

    println(AUTHORIZATION_SUCCESSFUL_MESSAGE)

}

const val LOGIN_CREATE = "Создайте логин:"
const val PASSWORD_CREATE = "Создайте пароль:"

const val LOGIN_REQUEST = "Введите логин:"
const val PASSWORD_REQUEST = "Введите пароль:"

const val AUTHORIZATION_SUCCESSFUL_MESSAGE = "Авторизация прошла успешно."