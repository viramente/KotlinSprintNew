package lesson2

fun main() {

    val highlyPaidEmployeesAmount = 50
    val highSalary = 30_000
    val probationersAmount = 30
    val probationersSalary = 20_000

    val highlyPaidEmployeesCosts = highlyPaidEmployeesAmount * highSalary
    val probationersCosts = probationersAmount * probationersSalary
    val totalCosts = highlyPaidEmployeesCosts + probationersCosts
    val averageSalary = totalCosts / (highlyPaidEmployeesAmount + probationersAmount)

    println(highlyPaidEmployeesCosts)
    println(totalCosts)
    println(averageSalary)

}