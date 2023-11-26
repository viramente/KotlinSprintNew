package lesson4

fun main() {

    val tablesAmount = 13

    val reservedForToday = 13
    val reservedForTomorrow = 9

    println("[Доступность столиков на сегодня: ${reservedForToday < tablesAmount}],\n" +
            "[Доступность столиков на завтра: ${reservedForTomorrow < tablesAmount}]")

}