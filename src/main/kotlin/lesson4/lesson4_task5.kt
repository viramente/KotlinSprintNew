package lesson4

fun main() {

    println("Имеет ли корабль повреждения? true/false")
    val isShipDamaged: Boolean = readln().toBoolean()

    println("Укажите число экипажа:")
    val numberOfCrew: Int = readln().toInt()

    println("Сколько ящиков провизии находится на борту?")
    val boxesOfProvisions: Int = readln().toInt()

    println("Благоприятна ли погода? true/false")
    val isWeatherFavorable: Boolean = readln().toBoolean()

    println("Корабль может отправиться в плавание: ${(!isShipDamaged &&
            (numberOfCrew in MIN_NUMBER_OF_CREW..MAX_NUMBER_OF_CREW) &&
            (boxesOfProvisions > MIN_BOXES_OF_PROVISIONS)) ||
            ((numberOfCrew == MAX_NUMBER_OF_CREW) &&
                    (boxesOfProvisions >= MIN_BOXES_OF_PROVISIONS) && 
                    isWeatherFavorable)}")

}

const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_BOXES_OF_PROVISIONS = 50