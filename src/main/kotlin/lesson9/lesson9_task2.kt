package lesson9

fun main() {

    val baseIngredients = mutableListOf("сахар", "соль", "перец")

    println("В рецепте есть базовые элементы:")
    baseIngredients.forEach { println(it) }

    println("Желаете добавить ещё? да/нет")
    val answer = readln()

    if (answer.equals("да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()

        baseIngredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты:")
        baseIngredients.forEach { println(it) }
    } else return
}