package lesson18

fun main() {

    val screen = Screen()

    val roundInt = screen.draw(12, 11, "круг")
    val roundFloat = screen.draw(12.09F, 11.1542F, "круг")
    val squareInt = screen.draw(187, 210, "квадрат")
    val squareFloat = screen.draw(181.0139F, 11.0F, "квадрат")
    val pointInt = screen.draw(1432, 1199, "точка")
    val pointFloat = screen.draw(98.011F, 116.42F, "точка")

}

class Screen() {
    fun draw(coordinatesX: Number, coordinatesY: Number, figureType: String) {
        if (coordinatesX is Int && coordinatesY is Int) {
            when (figureType) {
                "круг" -> RoundL18T5().draw(coordinatesX as Int, coordinatesY as Int)
                "квадрат" -> SquareL18T5().draw(coordinatesX as Int, coordinatesY as Int)
                "точка" -> PointL18T5().draw(coordinatesX as Int, coordinatesY as Int)
            }
        } else {
            when (figureType) {
                "круг" -> RoundL18T5().draw(coordinatesX as Float, coordinatesY as Float)
                "квадрат" -> SquareL18T5().draw(coordinatesX as Float, coordinatesY as Float)
                "точка" -> PointL18T5().draw(coordinatesX as Float, coordinatesY as Float)
            }
        }

    }
}

abstract class Figure() {
    abstract fun draw(coordinatesX: Int, coordinatesY: Int)
    abstract fun draw(coordinatesX: Float, coordinatesY: Float)
}

class RoundL18T5() : Figure() {

    override fun draw(coordinatesX: Int, coordinatesY: Int) {
        println("Нарисован круг c грубой установкой с координатами: $coordinatesX, $coordinatesY.")
    }

    override fun draw(coordinatesX: Float, coordinatesY: Float) {
        println("Нарисован круг c точной установкой с координатами: $coordinatesX, $coordinatesY.")
    }
}

class SquareL18T5() : Figure() {

    override fun draw(coordinatesX: Int, coordinatesY: Int) {
        println("Нарисован квадрат c грубой установкой с координатами: $coordinatesX, $coordinatesY.")
    }

    override fun draw(coordinatesX: Float, coordinatesY: Float) {
        println("Нарисован квадрат c точной установкой с координатами: $coordinatesX, $coordinatesY.")
    }
}

class PointL18T5() : Figure() {

    override fun draw(coordinatesX: Int, coordinatesY: Int) {
        println("Нарисована точка c грубой установкой с координатами: $coordinatesX, $coordinatesY.")
    }

    override fun draw(coordinatesX: Float, coordinatesY: Float) {
        println("Нарисована точка c точной установкой с координатами: $coordinatesX, $coordinatesY.")
    }
}