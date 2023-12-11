package lesson14.task3

import kotlin.math.PI
import kotlin.math.pow


fun main() {

    val figures = listOf<Figure>(
    Circle(10.8, "чёрный"),
    Circle(18.5, "белый"),
    Circle(5.4, "чёрный"),
    Circle(15.0, "белый"),
    Rectangle(11.0, 12.0, "чёрный"),
    Rectangle(8.1, 8.0, "чёрный"),
    Rectangle(12.5, 50.0, "белый"),
    )

    println("Сумма периметров всех чёрных фигур:\n" +
            "${figures.filter {it.color == "чёрный"}.sumOf { it.calculatePerimeter() }}")

    println("Сумма площадей всех белых фигур:\n" +
            "${figures.filter {it.color == "белый"}.sumOf {it.calculateArea()}}")
}

open class Figure(open val color: String) {
    open fun calculateArea(): Double = 0.0
    open fun calculatePerimeter(): Double = 0.0
}


class Circle(private val radiusInCm: Double, override val color: String): Figure(color) {
    override fun calculateArea() = radiusInCm * 2 * PI
    override fun calculatePerimeter() = (radiusInCm.pow(2.0) * PI)
}

class Rectangle(private val height: Double, private val width: Double, override val color: String): Figure(color) {
    override fun calculateArea() = height * width
    override fun calculatePerimeter() = (height + width) * 2
}