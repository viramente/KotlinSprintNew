package lesson12

fun main() {
    val wednesday = DayWeather2(272, 265, "снег")

    println(wednesday.dayTemperature)
    println(wednesday.nightTemperature)

}

class DayWeather2(
    _dayTemperatureInC: Int,
    _nightTemperatureInC: Int,
    _precipitation: String) {

        var dayTemperature: Int = _dayTemperatureInC - 273
        var nightTemperature: Int = _nightTemperatureInC - 273
        var precipitation: String = _precipitation
    }