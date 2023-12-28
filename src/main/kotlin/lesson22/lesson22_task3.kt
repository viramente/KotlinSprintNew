package lesson22

fun main() {

    val book = Book(543, "Земля", "Кроманьонец")

    val (bookId, bookAuthor, bookName) = book

    println(bookId)
    println(bookAuthor)
    println(bookName)

}

data class Book(val id: Int, val author: String, val name: String)