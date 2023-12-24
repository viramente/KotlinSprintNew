package lesson20

fun main() {

    val listOfElements = listOf("Первый", "Второй", "Третий", "Четвертый", "Пятый", "Шестой", "Седьмой")

    val listOfElementsAsLambda = listOfElements
        .map { element -> { elementName: String -> println("Нажат элемент $elementName")} }

    for (i in 1..<listOfElements.size step 2) {
        listOfElementsAsLambda[i](listOfElements[i])
    }
}