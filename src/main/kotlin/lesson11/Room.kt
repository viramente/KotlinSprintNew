package lesson11

class Room(
    val cover: String,
    val name: String,
    var users: MutableMap<String, String>
) {
    fun getUsers() {
        println("Участники комнаты \"$name\":")
        users.forEach { println(it.key) }
    }

    fun showUsersInfo(name: String) = println("$name ${users[name]}")
}