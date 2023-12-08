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

class Product(
    val category: Category,
    val ingredients: Map<String, String>,
    val recipe: String,
    var isFavorite: Boolean = false,
)

val burgerWithMushroomsAndCheese = Product(
    category = Burgers(),
    ingredients = mapOf(
        "Творог" to "250 г",
        "Куриное яйцо" to "2 шт.",
        ),
    recipe = "Тут рецепт."
)

//val cheeseburger = Product(...)
//val classicBurger = Product(...)