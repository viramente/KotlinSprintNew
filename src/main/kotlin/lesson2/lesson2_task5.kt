package lesson2

import kotlin.math.pow

fun main() {

    val baseSum = 70_000
    val interestRate = 16.7
    val timeOfPercentsAccruingInYear = 1
    val termOfDepositInYears = 20

    val totalSum = baseSum * (1 + interestRate/100/timeOfPercentsAccruingInYear).pow(termOfDepositInYears)

    val outputResult = String.format("%.3f", totalSum)
    println(outputResult)

}