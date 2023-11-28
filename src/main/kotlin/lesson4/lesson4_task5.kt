package lesson4

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    val shipIsNotDamaged: Boolean = reader.nextBoolean()
    val numberOfCrew: Int = reader.nextInt()
    val boxesOfProvisions: Int = reader.nextInt()
    val weatherIsFavorable: Boolean = reader.nextBoolean()

    println("Корабль может отправиться в плавание: ${(shipIsNotDamaged && (numberOfCrew in 55..70) && (boxesOfProvisions > 50)) || ((numberOfCrew == 70) && (boxesOfProvisions >= 50) && weatherIsFavorable)}")

}