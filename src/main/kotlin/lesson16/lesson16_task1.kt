package lesson16

fun main() {

    val randomDicesNumber = Dice()
    randomDicesNumber.getRandomNumber()

}

class Dice {
    private val randomNumber = (1..6).random()
    fun getRandomNumber() = println(randomNumber)
}