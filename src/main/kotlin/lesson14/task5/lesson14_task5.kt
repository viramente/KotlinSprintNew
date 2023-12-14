package lesson14.task5


fun main() {

    val foreignCountry = Chat()

    foreignCountry.createMessage("Andriene", "Сразу прошу прощения, если вопрос тупой. Насколько легко найти обычную работу без знания языка (только с англ.)?")
    foreignCountry.createMessage("moira", "А русский язык вы не знаете?",1)
    foreignCountry.createMessage("black_queen", "А куда подевался участник чата на букву Т и цифры?")
    foreignCountry.createMessage("yo-yo", "Занят своим чатом. Там у него пришло несколько тысяч пользователей.",3)
    foreignCountry.createMessage("Andriene", "Русский я знаю. Вопрос в том, что я вообще не знаю местный", 1)
    foreignCountry.createMessage("black_queen", "Передавайте ему лучи поддержки от нас. :)",3)
    foreignCountry.createMessage("seagull", "Подскажите, пожалуйста. Что надо, чтобы получить визу для посещения родственника?")
    foreignCountry.createMessage("moira", "Родственник должен оформить приглашение.",7)
    foreignCountry.createMessage("moira","Можно найти работу если вы знаете русский язык, английский тоже хорошо. Но работать с клиентами не пустят.",1)
    foreignCountry.createMessage("seagull", "Понятно, спасибо.",7)

    foreignCountry.printChat()

}

const val TABULATION = "    "

fun formalizeMassage(message: ChatMessage): String {
    return when (message) {
        is ChatChildMessage -> ("$TABULATION${message.author}: ${message.textMessage}")
        else -> ("${message.author}: ${message.textMessage}")
    }
}

class Chat() {

    private val chatMessages = mutableListOf<ChatMessage>()

    private var messageID = 0

    fun createMessage(author: String, text: String) {
        messageID++
        chatMessages.add(ChatMessage(messageID, author, text))
    }

    fun createMessage(author: String, text: String, parentMessageID: Int) {
        messageID++
        chatMessages.add(ChatChildMessage(messageID, author, text, parentMessageID))
    }

    fun printChat() {

        val messagesToOutput = mutableListOf<String>()

        val (childMessages, simpleMessages) = chatMessages.partition { it is ChatChildMessage }

        val childGroups = childMessages.groupBy { (it as ChatChildMessage).parentMessageID }

        simpleMessages.forEach { it ->
            messagesToOutput.add(formalizeMassage(it))
            val children = childGroups[it.chatMessageID]!!.map { formalizeMassage(it) }
            messagesToOutput.addAll(children)
        }

        messagesToOutput.forEach { println(it) }
    }
}

open class ChatMessage(val chatMessageID: Int, val author: String, val textMessage: String)

class ChatChildMessage(chatMessageID: Int, author: String, textMessage: String, val parentMessageID: Int) :
    ChatMessage(chatMessageID, author, textMessage)