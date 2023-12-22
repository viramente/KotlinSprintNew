package lesson17

fun main() {

    val userLes17 = PasswordLes17("anna", "banana")
    println(userLes17.password)
    userLes17.password = "liana"
    userLes17.login = "Anna"
    println(userLes17.login)

}

class PasswordLes17(_login: String, _password: String) {

    var login = _login
        get() = field
        set(value) {
            println("Логин успешно изменён.")
            field = value
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль.")
        }
}