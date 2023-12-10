package lesson13

fun main() {

    println("Введите имя:")
    val name = readln()

    println("Введите номер телефона:")
    val phoneNumber = try {
         readln().toLong()
    } catch (e: NumberFormatException) {
        println(e)
        0
    }

    println("Введите название компании.")
    val companyName = readln()

}

class TelephoneSubscriber5(
    val name: String,
    val phoneNumber: Long,
    val company: String,
) {
    fun getInfo() {
        println(
            """
           - Имя: $name
           - Номер: $phoneNumber
           - Компания: $company
        """.trimIndent()
        )
    }
}