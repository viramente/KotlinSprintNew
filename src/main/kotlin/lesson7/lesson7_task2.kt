package lesson7

fun main() {

    do {
        val authorizationCode = (1000..9999).random()
        println("Ваш код авторизации: $authorizationCode")

        println(CODE_REQUEST)
        val usersCode = readln().toInt()

    } while (authorizationCode != usersCode)

    println(WELCOME_MESSAGE)

}

const val WELCOME_MESSAGE = "Здравствуйте!"
const val CODE_REQUEST = "Введите код авторизации:"