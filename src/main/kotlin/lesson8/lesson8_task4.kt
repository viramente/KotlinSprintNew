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

    println("Для салата с грибами вам потребуются:")
    for (ingredient in mushroomSaladIngredients) println(ingredient)

    println("Какой ингредиент вы хотите заменить?")
    val ingredientToReplace = readln()

    if (ingredientToReplace in mushroomSaladIngredients) {

        println("На что вы хотите заменить это ингредиент?")
        val newIngredient = readln()

        val ingredientToReplaceIndex = mushroomSaladIngredients.indexOf(ingredientToReplace)
        mushroomSaladIngredients[ingredientToReplaceIndex] = newIngredient

        println("Готово! Вы сохранили следующий список:")

    } else println("Такого ингредиента в списке нет. Список остался неизменным:")

    for (ingredient in mushroomSaladIngredients) println(ingredient)
}