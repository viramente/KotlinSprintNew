package lesson12

fun main() {

    fun randomTemperatureInGradusC() = (-50..50).random()
    fun randomPrecipitation() = listOf(true, false).random()

    val listOfDays = mutableListOf<DayWeather3>()
        for (i in 1..30) listOfDays
            .add(DayWeather3(
                randomTemperatureInGradusC(),
                randomTemperatureInGradusC(),
                randomPrecipitation(),
                )
            )

    val listOfDayTemperatures = listOfDays.map { it.dayTemperatureInC }
    val listOfNightTemperatures = listOfDays.map { it.nightTemperatureInC }
    val listOfPrecipitation = listOfDays.map { it.isPrecipitation }

    val averageDayTemperature = listOfDayTemperatures.average()
    val averageNightTemperature = listOfNightTemperatures.average()
    val daysWithPrecipitations = listOfPrecipitation.filter { it }.size

    println(averageDayTemperature)
    println(averageNightTemperature)
    println(daysWithPrecipitations)

}



class DayWeather3(
    val dayTemperatureInC: Int,
    val nightTemperatureInC: Int,
    val isPrecipitation: Boolean,
)