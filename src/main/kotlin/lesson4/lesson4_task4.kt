package lesson4

fun main() {

    val today = 5
    val isEvenDay = today % 2 == 0

    println("""
Упражнения для рук:    $isEvenDay
Упражнения для ног:    ${!isEvenDay}
Упражнения для спины:  ${!isEvenDay}
Упражнения для пресса: $isEvenDay
""".trimIndent())

}