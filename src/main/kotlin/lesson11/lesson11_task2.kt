package lesson11

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