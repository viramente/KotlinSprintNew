package lesson9

fun main() {

    val cupcakesIngredients = listOf(
        "молоко",
        "яйцо",
        "мука",
        "разрыхлитель",
        "масло растительное",
        "сахар",
        "соль",
    )

    println("В рецепте есть следующие ингредиенты:")
    cupcakesIngredients.forEach { println(it) }

}