package lesson20

fun main() {

    val name = "Егор"

    val lambda: (String) -> Unit

    lambda = { username: String -> println("С наступающим Новым Годом, $username!") }

    lambda(name)

}