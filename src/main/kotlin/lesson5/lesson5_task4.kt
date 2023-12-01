package lesson5

fun main() {

    println(WELCOME_TEXT)

    println("Введите имя пользователя:")
    val usersLogin = readln()

    if (usersLogin != REGISTERED_LOGIN) {
        println(PROHIBITING_TEXT)
    } else {
        println("Введите пароль:")
        val usersPassword = readln()

        println(
            if (usersPassword == REGISTERED_PASSWORD)
                AUTHORIZATION_TEXT
            else PROHIBITING_TEXT
        )
    }
}

const val WELCOME_TEXT =
    "Внимание, пассажир. Моя обязанность, как обычно, незавидная, — приветствовать вас на борту корабля \"Heart of Gold\". [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь. [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
const val AUTHORIZATION_TEXT =
    "[вздыхает...] Ваши данные проверены, и о, чудо, они верны... Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне."
const val PROHIBITING_TEXT = "Ваших данных нет в системе. Зарегистрироваться и закончить процесс можно тут."
const val REGISTERED_LOGIN = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"