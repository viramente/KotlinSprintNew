package lesson15.task4

fun main() {

    val oboe = Instrument("гобой", 12)
    val guitar = Instrument("гитара", 23)
    val strings = Detail("струны", 123, guitar)
    val pins = Detail("колки", 5, guitar)
    val stick = Detail("трость", 81, oboe)

    val details = listOf(strings, pins, stick)

    oboe.searchDetails(details)
}

interface Searchable {
    fun searchDetails(details: List<Detail>) {
        println("Выполняется поиск...")
    }
}

abstract class Good(
    val name: String,
    val quantityInWarehouse: Int,
)

class Instrument(
    name: String,
    quantityInWarehouse: Int
) : Good(name, quantityInWarehouse), Searchable

class Detail(
    name: String,
    quantityInWarehouse: Int,
    val parentInstrument: Instrument
) : Good(name, quantityInWarehouse)