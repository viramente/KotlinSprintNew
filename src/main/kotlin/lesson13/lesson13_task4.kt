package lesson13

fun main() {

    val listOfSubscribers = mutableListOf<TelephoneSubscriber4>()

    println(
        "Внесение контактов в записную книжку. " +
                "Когда захотите прекратить работу, введите слово \"стоп\".\n"
    )

    do {
        println("Введите имя:")
        val name = readln()
        if (isStopCommand(name)) break

        println("Введите номер телефона:")

        val phoneNumberInString = readlnOrNull()
        if (phoneNumberInString != null && isStopCommand(phoneNumberInString)) break

        val phoneNumberInLong = phoneNumberInString?.toLongOrNull()

        if (phoneNumberInLong == null) {
            println("Вы не ввели номер телефона, контакт не будет сохранен.")
            continue
        }

        println("Введите название компании. Если хотите оставить это поле пустым, нажмите \"Enter\":")

        val companyNameInput: String? = readlnOrNull()
        if (companyNameInput != null && isStopCommand(companyNameInput)) {
            break
        }
        val companyName = if (companyNameInput.isNullOrBlank()) null else companyNameInput

        listOfSubscribers.add(TelephoneSubscriber4(name, phoneNumberInLong, companyName))
        println("Контакт $name сохранен.")

    } while (true)

    listOfSubscribers.forEach { it.getInfo() }
}


fun isStopCommand(text: String) = text.equals("стоп", true)

class TelephoneSubscriber4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getInfo() {
        println(
            """
           - Имя: $name
           - Номер: $phoneNumber
           - Компания: ${company ?: "<не указано>"} 
        """.trimIndent()
        )
    }
}