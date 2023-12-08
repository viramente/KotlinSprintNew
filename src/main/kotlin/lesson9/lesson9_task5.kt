package lesson9

fun main() {

    val setOfIngredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите ингредиент $i:")
        setOfIngredients.add(readln())
    }

    val orderedListOfIngredients = setOfIngredients.sorted().toMutableList()

    orderedListOfIngredients[0] = orderedListOfIngredients[0].replaceFirstChar { it.uppercase() }

    println(orderedListOfIngredients.joinToString(", "))
}