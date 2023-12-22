    package lesson12

fun main() {

    val wednesday = DayWeather()
    wednesday.dayTemperature = 12
    wednesday.nightTemperature = 6
    wednesday.isPrecipitation = true
    wednesday.getWeather()

    val thursday = DayWeather()
    thursday.dayTemperature = 14
    thursday.nightTemperature = 9
    thursday.isPrecipitation = false
    thursday.getWeather()
}

class DayWeather() {

    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isPrecipitation: Boolean = true

    fun getWeather() {
        println("""
            Погода на день: 
            температура днем: $dayTemperature °C,
            температура ночью: $nightTemperature °C,
            осадки: $isPrecipitation
            """.trimIndent())
    }
}