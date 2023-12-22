package lesson18

fun main() {

    val cube = Cube(13)
    val rectangle = Rectangle(10, 12, 30)

    println(cube.getPerimeterLes18Task4())
    println(rectangle.getPerimeterLes18Task4())
}

abstract class Box() {
    abstract fun getPerimeterLes18Task4(): Int
}

class Cube(private val side: Int) : Box() {
    override fun getPerimeterLes18Task4(): Int = side * side * side
}

class Rectangle(private val length: Int, private val width: Int, private val height: Int) : Box() {
    override fun getPerimeterLes18Task4(): Int = length * width * height
}