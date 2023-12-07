package lesson11

fun main() {

    val fridayRoom: Room = Room(
        "фото1",
        "Вагончик тронется",
        mutableMapOf(
            "egor_becker" to "разговаривает",
            "belka" to "микрофон выключен",
            "banana0mama" to "пользователь заглушен",
        ),
    )

    fridayRoom.getUsers()
    fridayRoom.showUsersInfo("belka")
}