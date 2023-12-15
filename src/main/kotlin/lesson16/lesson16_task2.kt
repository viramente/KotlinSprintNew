package lesson16

import kotlin.math.pow

fun main() {

    val circle = CircleLes16Task1(14.2)
    println(circle.getArea())
    println(circle.getPerimeter())

}

private const val PI = 3.14

class CircleLes16Task1(_radius: Double) {
    private val radius = _radius

    fun getPerimeter() = 2 * PI * radius
    fun getArea() = (radius.pow(2.0) * PI)
}
