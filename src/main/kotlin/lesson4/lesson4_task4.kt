package lesson4

fun main() {

    val today = 5
    val isOddDay = today / 2 == 1

    println("""
Упражнения для рук:       ${!isOddDay}
Упражнения для ног:       $isOddDay
Упражнения для спины:  $isOddDay
Упражнения для пресса: ${!isOddDay}
""")

}