package lesson9

fun main() {

    val oneServingOfOmeletIngredients = listOf(2, 50, 15)
    println("Сколько порций омлета вы хотите сделать?")
    val servingsAmount = readln().toInt()
    val totalIngredients = oneServingOfOmeletIngredients.map { it * servingsAmount }

    println("Для $servingsAmount порций омлета вам понадобится: " +
            "яиц – ${totalIngredients[0]} шт., молока – ${totalIngredients[1]} мл, " +
            "сливочного масла – ${totalIngredients[2]} г.")
}