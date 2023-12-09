package lesson12

fun main() {

    val wednesday = DayWeather1(12, 5, "дождь")
    val thursday = DayWeather1(14, 8, "дождь")

    wednesday.getWeather()
    thursday.getWeather()
}

class DayWeather1(
    private val dayTemperature: Int,
    private val nightTemperature: Int,
    private val precipitation: String,
) {
    fun getWeather() {
        println(
            """
            Погода на день: 
<<<<<<< HEAD
            температура днем: $dayTemperature °C,
            температура ночью: $nightTemperature °C,
=======
            температура днем: $dayTemperature °Cб,
            температура ночью: $nightTemperature °Cб,
>>>>>>> origin/lesson12_task2
            осадки: $precipitation
            """.trimIndent()
        )
    }
}