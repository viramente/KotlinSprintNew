package lesson15.task2

fun main() {
    val message1 = Temperature(12)
    val message2 = PrecipitationAmount(10)
    val message3 = Temperature(0)
    message1.sendToServer()
    message2.sendToServer()
    message3.sendToServer()
}

abstract class WeatherStationStats(private val dateClassName: String?, private val date: Int,) {

    fun sendToServer() {
        when (dateClassName) {
            "Temperature" -> println("Температура: $date")
            "PrecipitationAmount" -> println("Осадки: $date")
            else -> println("не вышло")
        }
    }
}

class Temperature(
    dateTemperature: Int,
    dateClassName: String? = (Temperature::class.simpleName)!!.split(" ")[0]
) : WeatherStationStats(dateClassName, dateTemperature,)

class PrecipitationAmount(
    datePrecipitation: Int,
    dateClassName: String? = (PrecipitationAmount::class.simpleName)!!.split(" ")[0]
) : WeatherStationStats(dateClassName, datePrecipitation,)