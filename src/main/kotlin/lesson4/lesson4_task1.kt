package lesson4

fun main() {

    val reservedForToday = 13
    val reservedForTomorrow = 9

    println("[Доступность столиков на сегодня: ${reservedForToday < TABLES_AMOUNT}],\n" +
            "[Доступность столиков на завтра: ${reservedForTomorrow < TABLES_AMOUNT}]")

}

const val TABLES_AMOUNT = 13