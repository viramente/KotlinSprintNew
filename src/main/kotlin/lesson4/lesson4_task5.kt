package lesson4

fun main() {

    val shipIsNotDamaged: Boolean = readln().toBoolean()
    val numberOfCrew: Int = readln().toInt()
    val boxesOfProvisions: Int = readln().toInt()
    val weatherIsFavorable: Boolean = readln().toBoolean()

    println("Корабль может отправиться в плавание: ${(shipIsNotDamaged &&
            (numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW) &&
            (boxesOfProvisions > MIN_BOXES_OF_PROVISIONS)) ||
            ((numberOfCrew == MAX_NUMBER_OF_CREW) &&
                    (boxesOfProvisions >= MIN_BOXES_OF_PROVISIONS) && 
                    weatherIsFavorable)}")

}

const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_BOXES_OF_PROVISIONS = 50