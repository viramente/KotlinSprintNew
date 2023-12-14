package lesson15.task2

fun main() {

    val server = WeatherServer()

    server.sendToServer(Temperature(12))
    server.sendToServer(PrecipitationAmount(10))
    server.sendToServer(Temperature(0))
}

abstract class WeatherStationStats(val date: Int,)

class WeatherServer() {

    fun sendToServer(weatherData: WeatherStationStats) {
        when (weatherData) {
            is Temperature -> println("Температура: ${weatherData.date}")
            is PrecipitationAmount -> println("Осадки: ${weatherData.date}")
            else -> println("не вышло")
        }
    }

}

class Temperature(
    dateTemperature: Int,
) : WeatherStationStats(dateTemperature)

class PrecipitationAmount(
    datePrecipitation: Int,
) : WeatherStationStats(datePrecipitation)