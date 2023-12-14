package lesson11.task2

fun main() {

    val user3 = User2(
        id = 2,
        login = "suitcase",
        password = "mymemory",
        email = "suitcase@gmail.com",
    )

    user3.addBio("Хирург. Родился в Петрозаводске, живу в Питтсбурге.")
    user3.changePassword()
    user3.readBio()
    println(user3.password)
}

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