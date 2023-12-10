package lesson13

fun main() {

    val rostislav = TelephoneDirectory2 ("Ростислав", 89123456789, "Reddit")
    val jenya = TelephoneDirectory2 ("Женя", 8912880169)

    rostislav.getInfo()
    jenya.getInfo()
}

class TelephoneDirectory2 (
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun getInfo() {
        println("""
           - Имя: $name
           - Номер: $phoneNumber
           - Компания: ${company ?: "<не указано>"} 
        """.trimIndent())
    }
}