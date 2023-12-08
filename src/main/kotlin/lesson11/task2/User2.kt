package lesson11.task2

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {
    fun readBio() = println(bio)

    fun addBio(newBio: String) {
        bio = newBio
    }

    fun changePassword() {
        println("Введите действующий пароль:")
        val newPassword = readln()
        if (password == newPassword) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменён.")
        }
    }
}