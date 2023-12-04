package lesson8

fun main() {

    println("Сколько ингредиентов будет в списке?")
    val ingredients = Array(readln().toInt()) { it ->
        println("Введите ингредиент ${it + 1}:")
        readln()
    }

}