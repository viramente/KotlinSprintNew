package lesson11

import lesson11.task1.User

fun main() {

    val user1 = User(
        id = 1,
        login = "swallow",
        password = "engelise",
        email = "swallow@gmail.com",
    )

    val user2 = User(
        id = 2,
        login = "suitcase",
        password = "mymemory",
        email = "suitcase@gmail.com",
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)

}