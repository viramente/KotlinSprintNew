    package lesson12

fun main() {

    val wednesday = DayWeather()
    val thursday = DayWeather()

    wednesday.getWeather()
    thursday.getWeather()
}

class DayWeather() {

    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var precipitation: String = "солнечно"

    fun getWeather() {
        println("""
            Погода на день: 
            температура днем: $dayTemperature °Cб,
            температура ночью: $nightTemperature °Cб,
            осадки: $precipitation
            """.trimIndent())
    }
}