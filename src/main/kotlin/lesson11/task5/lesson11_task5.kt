package lesson11.task5

fun main() {

    val forumPicturesAndVibes = Forum("Картинки и вайбы")

    forumPicturesAndVibes.createNewUser("Andy")
    forumPicturesAndVibes.createNewUser("Mary")

    forumPicturesAndVibes.createNewMessage(
        1,
        "Ничего не имею против этой милой девушки. Но к фотографам вопросики есть.",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.createNewMessage(
        2,
        "Сейчас вылизанность и правильность вообще не тренд в фотографии.",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.createNewMessage(
        1,
        "А ничего, что у нее одна рука в два раза больше другой?",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.createNewMessage(
        2,
        "Рядовому юзеру вообще пофигу.",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.printThread()
}

fun getUsersName(forumUserInt: Int, forum: Forum): String {
    return forum.listOfForumUsers.find { it.userId == forumUserInt }!!.userName
}

fun isInListOfForumUsers(authorID: Int, forum: Forum) =
    authorID in forum.listOfForumUsers.map { it.userId }

class Forum(val name: String) {

    val listOfForumUsers = mutableListOf<ForumUser>()
    private var userID = 0

    fun createNewUser(userName: String) {
        userID++
        listOfForumUsers.add(ForumUser(userID, userName))
    }

    private val messages = mutableListOf<ForumMessage>()

    fun createNewMessage(authorID: Int, messageText: String, forum: Forum) {
        if (isInListOfForumUsers(authorID, forum)) {
            messages.add(ForumMessage(authorID, messageText, forum))
        }
    }

    fun printThread() {
        messages.forEach { println("${getUsersName(it.authorID, this)}: ${it.messageText}") }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorID: Int,
    val messageText: String,
    val forum: Forum,
)