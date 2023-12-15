package lesson16

fun main() {

    val user = UserLes16Task3("andy", "birze123")
    println("Подтверждение пароля: ${user.validate("birze132")}")
    println("Подтверждение пароля: ${user.validate("birze123")}")
}

class UserLes16Task3(login: String, _password: String) {

    private val userPassword = _password
    fun validate(password: String) = password == userPassword

}