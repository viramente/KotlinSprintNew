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

    private fun drawRound(coordinatesX: Float, coordinatesY: Float): RoundL18T5 {
        println("Нарисован круг c точной установкой с координатами: $coordinatesX, $coordinatesY.")
        return RoundL18T5(coordinatesX, coordinatesY)
    }

    private fun drawRound(coordinatesX: Int, coordinatesY: Int): RoundL18T5 {
        println("Нарисован круг c грубой установкой с координатами: $coordinatesX, $coordinatesY.")
        return RoundL18T5(coordinatesX, coordinatesY)
    }

    private fun drawSquare(coordinatesX: Float, coordinatesY: Float): SquareL18T5 {
        println("Нарисован квадрат c точной установкой с координатами: $coordinatesX, $coordinatesY.")
        return SquareL18T5(coordinatesX, coordinatesY)
    }

    private fun drawSquare(coordinatesX: Int, coordinatesY: Int): SquareL18T5 {
        println("Нарисован квадрат c грубой установкой с координатами: $coordinatesX, $coordinatesY.")
        return SquareL18T5(coordinatesX, coordinatesY)
    }

    private fun drawPoint(coordinatesX: Float, coordinatesY: Float): PointL18T5 {
        println("Нарисована точка c точной установкой с координатами: $coordinatesX, $coordinatesY.")
        return PointL18T5(coordinatesX, coordinatesY)
    }

    private fun drawPoint(coordinatesX: Int, coordinatesY: Int): PointL18T5 {
        println("Нарисована точка c грубой установкой с координатами: $coordinatesX, $coordinatesY.")
        return PointL18T5(coordinatesX, coordinatesY)
    }

    fun draw(coordinatesX: Number, coordinatesY: Number, figureName: String) {

        when (figureName) {

            "круг" -> if (coordinatesX is Float && coordinatesY is Float) {
                drawRound(coordinatesX, coordinatesY)
            } else drawRound(coordinatesX as Int, coordinatesY as Int)

            "квадрат" -> if (coordinatesX is Float && coordinatesY is Float) {
                drawSquare(coordinatesX, coordinatesY)
            } else drawSquare(coordinatesX as Int, coordinatesY as Int)

            "точка" -> if (coordinatesX is Float && coordinatesY is Float) {
                drawPoint(coordinatesX, coordinatesY)
            } else drawPoint(coordinatesX as Int, coordinatesY as Int)

        }
    }
}

class RoundL18T5(coordinatesX: Number, coordinatesY: Number)

class SquareL18T5(coordinatesX: Number, coordinatesY: Number)

class PointL18T5(coordinatesX: Number, coordinatesY: Number)