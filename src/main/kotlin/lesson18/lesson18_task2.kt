package lesson18

fun main() {
    val fourSidedDice = FourSidedDice()
    val sixSidedDice = SixSidedDice()
    val eightSidedDice = EightSidedDice()

    val dices: List<DiceLes18Task2> = listOf(fourSidedDice, sixSidedDice, eightSidedDice)
    dices.forEach { it.rollDiceLes18Task2() }
}

open class DiceLes18Task2(val sidesAmount: Int) {
    open fun rollDiceLes18Task2() = println((1..sidesAmount).random())
}

class FourSidedDice(sidesAmount: Int = 4) : DiceLes18Task2(sidesAmount)
class SixSidedDice(sidesAmount: Int = 6) : DiceLes18Task2(sidesAmount)
class EightSidedDice(sidesAmount: Int = 8) : DiceLes18Task2(sidesAmount)