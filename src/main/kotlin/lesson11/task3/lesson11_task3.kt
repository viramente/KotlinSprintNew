package lesson11.task3

fun main() {

    val fridayRoom: Room = Room(
        "фото1",
        "Вагончик тронется",
        mutableListOf(
            Member("egor_becker", "разговаривает"),
            Member("belka", "микрофон выключен"),
            Member("banana0mama", "пользователь заглушен"),
        ),
    )

    fridayRoom.getUsers()
    fridayRoom.showUsersInfo(fridayRoom.users[0])
}

class Member(val login: String, val status: String)

class Room(
    val cover: String,
    val name: String,
    var users: MutableList<Member>
) {
    fun getUsers() {
        println("Участники комнаты \"$name\":")
        users.forEach { println(it.login) }
    }

    fun showUsersInfo(user: Member) = println("${user.login} ${user.status}")
}