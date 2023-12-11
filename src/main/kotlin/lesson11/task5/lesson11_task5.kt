package lesson11.task5

fun main() {

    val forumPicturesAndVibes = Forum("Картинки и вайбы")

    forumPicturesAndVibes.createNewMessage(
        forumPicturesAndVibes.listOfForumUsers[0],
        "Ничего не имею против этой милой девушки. Но к фотографам вопросики есть.",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.createNewMessage(
        forumPicturesAndVibes.listOfForumUsers[1],
        "Сейчас вылизанность и правильность вообще не тренд в фотографии.",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.createNewMessage(
        forumPicturesAndVibes.listOfForumUsers[0],
        "А ничего, что у нее одна рука в два раза больше другой?",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.createNewMessage(
        forumPicturesAndVibes.listOfForumUsers[1],
        "Рядовому юзеру вообще пофигу.",
        forumPicturesAndVibes,
    )

    forumPicturesAndVibes.printThread()

}


fun isInListOfForumUsers(author: ForumUser, forum: Forum) =
    author.userId in forum.listOfForumUsers.map { it.userId }

class Forum(val name: String) {
    private val listOfForumUsersNames = listOf("sandy", "Roberta_Duck")
    val listOfForumUsers = mutableListOf<ForumUser>()

    init {
        listOfForumUsersNames.forEach { listOfForumUsers.add(createNewUser(it)) }
    }

    companion object {
        private var userId = 0
        fun createNewUser(userName: String): ForumUser {
            userId++
            return ForumUser(userId, userName)
        }
    }


    val messages = mutableListOf<ForumMessage>()

    fun createNewMessage(author: ForumUser, messageText: String, forum: Forum) {
        if (isInListOfForumUsers(author, forum)) {
            messages.add(ForumMessage(author, messageText, forum))
        }
    }

    fun printThread() {
        messages.forEach { println("${it.author.userName}: ${it.messageText}") }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
)


class ForumMessage(
    val author: ForumUser,
    val messageText: String,
    val forum: Forum,
)