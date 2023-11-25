package lesson3

fun main() {

    var numberForMultiplying: Int = 6

    val tableOfMultiplying =
    "$numberForMultiplying x 1 = " + "%${2}s".format(numberForMultiplying * 1) + "\n" +
    "$numberForMultiplying x 2 = " + "%${2}s".format(numberForMultiplying * 2) + "\n" +
    "$numberForMultiplying x 3 = " + "%${2}s".format(numberForMultiplying * 3) + "\n" +
    "$numberForMultiplying x 4 = " + "%${2}s".format(numberForMultiplying * 4) + "\n" +
    "$numberForMultiplying x 5 = " + "%${2}s".format(numberForMultiplying * 5) + "\n" +
    "$numberForMultiplying x 6 = " + "%${2}s".format(numberForMultiplying * 6) + "\n" +
    "$numberForMultiplying x 7 = " + "%${2}s".format(numberForMultiplying * 7) + "\n" +
    "$numberForMultiplying x 8 = " + "%${2}s".format(numberForMultiplying * 8) + "\n" +
    "$numberForMultiplying x 9 = " + "%${2}s".format(numberForMultiplying * 9) + "\n"

    println(tableOfMultiplying)

}