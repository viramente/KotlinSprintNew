package lesson9

fun main() {

    val setOfIngredients = Array(5) {
        println("Введите ингредиент ${it + 1}:")
        readln()
    }

    val orderedListOfIngredients = setOfIngredients.sorted().toMutableList()

    orderedListOfIngredients[0] = orderedListOfIngredients[0].replaceFirstChar { it.uppercase() }

    println(orderedListOfIngredients.joinToString(", "))
}