package lesson3

fun main() {

    val numberForMultiplying: Int = 6

    val tableOfMultiplying = """
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 1)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 2)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 3)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 4)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 5)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 6)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 7)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 8)}
    $numberForMultiplying x 9 = ${"%${2}s".format(numberForMultiplying * 9)}
    """
    println(tableOfMultiplying)

}