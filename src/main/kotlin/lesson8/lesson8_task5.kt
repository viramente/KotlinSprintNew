package lesson8

fun main() {

    println("Сколько ингредиентов будет в списке?")

    val ingredientsAmount = readln().toInt()

    val ingredients = Array(ingredientsAmount) { "" }

    for (index in 0..<ingredients.size) {
        println("Введите ингредиент ${index + 1}:")
        ingredients[index] = readln()
    }

}