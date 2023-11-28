package lesson3

fun main() {

    val inputString = "D2-D4;0"
    val (startPosition, finishPosition, moviesNumber) = inputString.split("-", ";")

    println(startPosition)
    println(finishPosition)
    println(moviesNumber)

}