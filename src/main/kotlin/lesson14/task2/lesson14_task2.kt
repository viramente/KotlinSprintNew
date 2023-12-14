package lesson14.task2

fun main() {

    val liner1 = Liner2()
    val cargo1 = CargoShip2()
    val icebreaker1 = Icebreaker2()

    liner1.getShipInfo()
    cargo1.getShipInfo()
    icebreaker1.getShipInfo()
}


open class Liner2() {
    open val speed: Int = 40
    open val carryingCapacityInTones: Int = 2725
    open val passengersAmount: Int = 5400
    open fun load() = println("Выдвигает горизонтальный трап со шкафута.")

    open fun getShipInfo() = println("""
        ИНФОРМАЦИЯ О КОРАБЛЕ:
        скорость, км/ч: $speed,
        грузоподъемность, Т: $carryingCapacityInTones, 
        максимальное количество пассажиров, чел.: $passengersAmount.  
        """.trimIndent())
}

class CargoShip2() : Liner2() {
    override val speed = 30
    override val carryingCapacityInTones = 8000
    override val passengersAmount = 11

    override fun load() = println("Активирует погрузочный кран.")
}

class Icebreaker2() : Liner2() {
    override val speed = 20
    override val carryingCapacityInTones = 500
    override val passengersAmount = 245
    override fun load() = println("Открывает ворота со стороны кормы.")

    fun breakIce() = println("Колет лёд")

}