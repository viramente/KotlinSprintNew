package lesson8

fun main() {

    val mushroomSaladIngredients = arrayOf(
        "оливковое масло",
        "грибы",
        "чеснок",
        "чёрный перец",
        "белое вино",
        "укроп",
        "петрушка",
    )

    println("Укажите искомый ингредиент:")
    val desiredIngredient = readln()

    for (ingredient in mushroomSaladIngredients) {
        if (desiredIngredient == ingredient) {
            println("Ингредиент \"$desiredIngredient\" есть в рецепте!")
            return
        }
    }
    println("Ингредиента \"$desiredIngredient\" в рецепте нет.")
}

