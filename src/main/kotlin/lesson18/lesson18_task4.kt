package lesson18

fun main() {

    val registry = BoxesRegistry()

    val cube = registry.createBox(13)
    val rectangle = registry.createBox(10, 12, 30)

    println(cube.getPerimeterLes18Task4(cube))
    println(rectangle.getPerimeterLes18Task4(rectangle))
}

class BoxesRegistry() {

    fun createBox(side: Int): Cube = Cube(side)
    fun createBox(length: Int, width: Int, height: Int): Rectangle = Rectangle(length, width, height)

}

open class Box() {

    fun getPerimeterLes18Task4(box: Box): Int {

        return when (box) {
            is Cube -> box.side * box.side * box.side
            is Rectangle -> box.length * box.width * box.height
            else -> 0
        }

    }
}

class Cube(val side: Int) : Box()

class Rectangle(val length: Int, val width: Int, val height: Int) : Box()