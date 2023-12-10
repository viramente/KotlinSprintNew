package lesson13

fun main() {

    val listOfSubscribers = listOf(
        TelephoneSubscriber3("Марина", 89764598539, "Марина Мирабелла"),
        TelephoneSubscriber3("Олег Геннадьевич Митрохин", 89745305594, "Градостроительство"),
        TelephoneSubscriber3("Марис", 89692098500, null),
        TelephoneSubscriber3("Сантехник", 89701598936, "null"),
        TelephoneSubscriber3("Наталья Андреевна", 89904598544, null),
    )

    listOfSubscribers.filter { it.company != null }.forEach { println(it.company) }

}

class TelephoneSubscriber3 (
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