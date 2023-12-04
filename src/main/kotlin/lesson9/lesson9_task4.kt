package lesson9

fun main() {

    println("Укажите пять названий ингредиентов блюда \n" +
            "(в одной строке, разделяя их запятой с пробелом после запятой):")
    val usersIngredients = readln().split(", ")

    val orderedListOfIngredients = usersIngredients.sorted()
    orderedListOfIngredients.forEach { println(it) }

}