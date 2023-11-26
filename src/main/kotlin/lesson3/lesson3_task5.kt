package lesson3

fun main() {

    val inputString = "D2-D4;0"
    val startPosition = "${inputString[0]}${inputString[1]}"
    val finishPosition = "${inputString[3]}${inputString[4]}"
    val moviesNumber = inputString[6]

    println(startPosition)
    println(finishPosition)
    println(moviesNumber)

}