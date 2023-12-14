package lesson13

fun main() {

    val rostislav = TelephoneSubscriber2("Ростислав", 89123456789, "Reddit")
    val jenya = TelephoneSubscriber2("Женя", 8912880169)

    rostislav.getInfo()
    jenya.getInfo()
}

class TelephoneSubscriber2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getInfo() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: ${company ?: "<не указано>"}\n"
        )
    }
}