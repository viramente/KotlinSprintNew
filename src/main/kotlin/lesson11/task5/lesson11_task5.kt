package lesson11.task5

fun main() {

    val forumPicturesAndVibes = Forum("Картинки и вайбы")
    val forumAllForCars = Forum("Всё для машин")

    val sandy = ForumUser.createNewUser("sandy", forumPicturesAndVibes)
    val robertaDuck = ForumUser.createNewUser("Roberta_Duck", forumPicturesAndVibes)
    val angryTractor =
        ForumUser.createNewUser("angry_tractor", forumAllForCars) // для проверки, что его сообщение не пройдет

    val message1 = ForumMessage.createNewMessage(
        robertaDuck,
        "Ничего не имею против этой милой девушки. Но к фотографам вопросики есть.",
    )

    val message2 = ForumMessage.createNewMessage(
        sandy,
        "Сейчас вылизанность и правильность вообще не тренд в фотографии.",
    )

    val message3 = ForumMessage.createNewMessage(
        robertaDuck,
        "А ничего, что у нее одна рука в два раза больше другой?",
    )

    val message4 = ForumMessage.createNewMessage(
        angryTractor,
        "А где фото машины, я не понял!",
    )

    val message5 = ForumMessage.createNewMessage(
        sandy,
        "Рядовому юзеру вообще пофигу.",
    )


    forumPicturesAndVibes.printThread()
}


fun isUserInRegistry(userId: Int) = userId in UsersRegistry.allUsers.map { it.userId }


class Forum(val name: String) {
    val messages = mutableListOf<ForumMessage>()
    fun printThread() {
        messages.forEach { println("${it.author.userName}: ${ it.messageText }") }
    }
}


class ForumUser private constructor(
    val userId: Int,
    val userName: String,
    val userForum: Forum
) {
    companion object {

        private var userId = 0

        fun createNewUser(userName: String, userForum: Forum): ForumUser {
            userId++
            UsersRegistry.addUser(ForumUser(userId, userName, userForum))
            return ForumUser(userId, userName, userForum)
        }
    }
}

class ForumMessage private constructor(
    val author: ForumUser,
    val messageText: String
) {
    companion object {

        fun createNewMessage(author: ForumUser, messageText: String): ForumMessage {
            if (isUserInRegistry(author.userId))
                author.userForum.messages.add(ForumMessage(author, messageText))
            return ForumMessage(author, messageText)
        }
    }
}


object UsersRegistry {

    val allUsers = mutableListOf<ForumUser>()

    fun addUser(member: ForumUser) {
        allUsers.add(member)
    }
}