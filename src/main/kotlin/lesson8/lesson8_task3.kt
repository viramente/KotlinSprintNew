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

    println(
        if (desiredIngredient in mushroomSaladIngredients)
            "Ингредиент $desiredIngredient есть в рецепте!"
        else "Ингредиента $desiredIngredient в рецепте нет."
    )
}