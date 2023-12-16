package lesson15.task5


// А еще можно сделать цикл do while, и чтобы грузовик тратил на дорогу больше времени, чем легковая машина
// (можно через sleep реализовать), и чтобы программа сама рассчитывала, когда какой транспорт подъехал и уехал!
// (И чтобы грузовик ездил только пока груз есть, а не гонял с одним пассажиром).
// И тогда можно и пассажиров, и грузы поместить как свойства в класс "Очередь на перевозку".
// (Но я не знаю, не лишнее ли это, такого вроде как нет в ТЗ).


fun main() {

    val passengers = PassengersToLoad(9)
    val cargo = CargoGroupToLoadInT(5)

    passengers.getNumberOfPassengersInWaiting()
    cargo.getQuantityOfCargoInWaiting()

    val truck = Truck()
    val auto = PassengerTransport()

    truck.load(passengers)
    truck.load(cargo)
    truck.unload(passengers)
    truck.unload(cargo)

    passengers.getNumberOfPassengersInWaiting()
    cargo.getQuantityOfCargoInWaiting()

    auto.load(passengers)
    auto.unload(passengers)

    passengers.getNumberOfPassengersInWaiting()
    cargo.getQuantityOfCargoInWaiting()

    auto.load(passengers)
    auto.unload(passengers)

    auto.load(passengers)
    auto.unload(passengers)
}

open class UnitToLoad()

class PassengersToLoad(var passengersQuantity: Int) : UnitToLoad() {
    fun getNumberOfPassengersInWaiting() = println("Посадки ждут: $passengersQuantity чел.")
}

class CargoGroupToLoadInT(var cargoQuantity: Int) : UnitToLoad() {
    fun getQuantityOfCargoInWaiting() = println("Погрузки ждут: $cargoQuantity т.")
}


interface Transportable {
    fun load(unitToLoad: UnitToLoad)
    fun unload(unitToLoad: UnitToLoad)
}

abstract class Transport() : Transportable

class Truck() : Transport() {
    private val maxPassengersAmount: Int = 1
    private val maxCargoAmountInTones: Int = 2
    private var passengersInIt: Int = 0
    private var cargoInIt: Int = 0

    override fun load(unitToLoad: UnitToLoad) {
        when (unitToLoad) {
            is PassengersToLoad -> {
                passengersInIt =
                    if (unitToLoad.passengersQuantity < maxPassengersAmount)
                        unitToLoad.passengersQuantity else maxPassengersAmount
                unitToLoad.passengersQuantity -= passengersInIt
                println("Пассажиры сели в грузовой автомобиль: $passengersInIt чел., " +
                        "ждать остались ${unitToLoad.passengersQuantity} чел.")
            }

            is CargoGroupToLoadInT -> {
                cargoInIt =
                    if (unitToLoad.cargoQuantity < maxCargoAmountInTones)
                        unitToLoad.cargoQuantity else maxCargoAmountInTones
                unitToLoad.cargoQuantity -= cargoInIt
                println("Груз погружен в грузовой автомобиль: $cargoInIt т, " +
                        "погрузки ждёт ${unitToLoad.cargoQuantity} т.")
            }
        }
    }

    override fun unload(unitToLoad: UnitToLoad) {
        when (unitToLoad) {
            is PassengersToLoad -> {
                println("Пассажиры ($passengersInIt чел.) доставлены грузовым автомобилем.")
                passengersInIt = 0

            }

            is CargoGroupToLoadInT -> {
                println("Груз ($cargoInIt т) доставлены грузовым автомобилем.")
                cargoInIt = 0
            }
        }
    }
}

class PassengerTransport() : Transport() {
    private val maxPassengersAmount: Int = 3
    private var passengersInIt: Int = 0

    override fun load(unitToLoad: UnitToLoad) {
        when (unitToLoad) {
            is PassengersToLoad -> {
                passengersInIt =
                    if (unitToLoad.passengersQuantity < maxPassengersAmount)
                        unitToLoad.passengersQuantity else maxPassengersAmount
                unitToLoad.passengersQuantity -= passengersInIt
                println("Пассажиры сели в легковой автомобиль: $passengersInIt чел., " +
                        "ждать остались ${unitToLoad.passengersQuantity} чел.")
            }
        }
    }

    override fun unload(unitToLoad: UnitToLoad) {
        when (unitToLoad) {
            is PassengersToLoad -> {
                println("Пассажиры ($passengersInIt чел.) доставлены легковым автомобилем.")
                passengersInIt = 0
            }
        }
    }
}