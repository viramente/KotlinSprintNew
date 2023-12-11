package lesson14.task1

fun main() {

    val liner1 = Liner()
    val cargo1 = CargoShip()
    val icebreaker1 = Icebreaker()

}

open class Liner() {
    open val speed: Int = 40
    open val carryingCapacityInTones: Int = 2725
    open val passengersAmount: Int = 5400
}

class CargoShip() : Liner() {
    override val speed = 30
    override val carryingCapacityInTones = 8000
    override val passengersAmount = 11
}

class Icebreaker() : Liner() {
    override val speed = 20
    override val carryingCapacityInTones = 500
    override val passengersAmount = 245
    fun breakIce() = println("Колет лёд")
}