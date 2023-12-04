package lesson9

fun main() {

    println("Введите первый ингредиент:")
    val firstIngredient = readln()

    println("Введите второй ингредиент:")
    val secondIngredient = readln()

    println("Введите третий ингредиент:")
    val thirdIngredient = readln()

    println("Введите четвёртый ингредиент:")
    val fourthIngredient = readln()

    println("Введите пятый ингредиент:")
    val fifthIngredient = readln()

    val setOfIngredients = setOf(
        firstIngredient,
        secondIngredient,
        thirdIngredient,
        fourthIngredient,
        fifthIngredient,
    )

    val orderedListOfIngredients = setOfIngredients.sorted().toMutableList()

    orderedListOfIngredients[0] = orderedListOfIngredients[0].replaceFirstChar { it.uppercase() }

    for (i in 0..<orderedListOfIngredients.size - 1) {
        orderedListOfIngredients[i] = orderedListOfIngredients[i] + ", "
    }

    println(orderedListOfIngredients.joinToString(""))

}