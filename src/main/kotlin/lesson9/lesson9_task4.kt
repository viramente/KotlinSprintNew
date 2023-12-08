package lesson9

fun main() {

    println(
        "Укажите пять названий ингредиентов блюда \n" +
                "(в одной строке, разделяя их запятой с пробелом после запятой):"
    )

    readln()
        .split(", ")
        .sorted()
        .forEach { println(it) }
}