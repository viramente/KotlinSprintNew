package lesson5

fun main() {

    println("Введите свой год рождения:")
    val usersYearOfBirth = readln().toInt()

    val userAge = CURRENT_YEAR - usersYearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }

}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023