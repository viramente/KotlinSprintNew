package lesson11.task4

open class Category(
    val name: String,
    val annotation: String,
    )

class Burgers(
    name: String = "Бургеры",
    annotation: String = "Описание",
): Category(name, annotation)

class Deserts(
    name: String = "Десерты",
    annotation: String = "Описание",
): Category(name, annotation)

class Pizza(
    name: String = "Пицца",
    annotation: String = "Описание"
): Category(name, annotation)

class Fish(
    name: String = "Рыба",
    annotation: String = "Описание"
): Category(name, annotation)

class Ingredient(
    val foodStuff: String,
    val quantity: Int,
    val unit: String,
)

class Product(
    val category: Category,
    val ingredients: List<Ingredient>,
    val recipe: String,
    var isFavorite: Boolean = false,
)

val burgerWithMushroomsAndCheese = Product(
    category = Burgers(),
    ingredients = listOf(
        Ingredient("Творог", 250, "г"),
        Ingredient("Куриное яйцо", 2, "шт."),
        ),
    recipe = "Тут рецепт."
)