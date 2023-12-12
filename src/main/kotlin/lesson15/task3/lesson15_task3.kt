package lesson15.task3


fun main() {

    val oleg = SimpleUser()
    oleg.readMessages()
    oleg.createMessages()

    val mamba = Admin()
    mamba.readMessages()
    mamba.createMessages()
    mamba.deleteMessages()
    mamba.deleteUser()
}

abstract class User {
    abstract fun readMessages()
    abstract fun createMessages()
}

class SimpleUser : User() {
    override fun readMessages() {
        println("Пользователь читает сообщение")
    }

    override fun createMessages() {
        println("Пользователь создает сообщение")
    }
}


class Admin : User() {

    override fun readMessages() {
        println("Админ читает сообщение")
    }

    override fun createMessages() {
        println("Админ создает сообщение")
    }

    fun deleteMessages() {
        println("Админ удаляет сообщение")
    }

    fun deleteUser() {
        println("Админ удаляет пользователя")
    }
}