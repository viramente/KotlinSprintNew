package lesson13

fun main() {

    val listOfSubscribers = listOf(
        TelephoneDirectory3("Марина", 89764598539, "Марина Мирабелла"),
        TelephoneDirectory3("Олег Геннадьевич Митрохин", 89745305594, "Градостроительство"),
        TelephoneDirectory3("Марис", 89692098500, null),
        TelephoneDirectory3("Сантехник", 89701598936, "null"),
        TelephoneDirectory3("Наталья Андреевна", 89904598544, null),
    )

    listOfSubscribers.filter { it.company != null }.forEach { println(it.company) }

}

class TelephoneDirectory3 (
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