package lesson4

fun main() {

    val currentSun = true
    val currentAwningState = true
    val currentAirHumidityInPercents = 20
    val currentSeason = "winter"

    val likelyConditions = (currentSun == IS_SUNNY) &&
            (currentAwningState == IS_AWNING_OPEN) &&
            (currentAirHumidityInPercents == REQUIRED_AIR_HUMIDITY_IN_PERCENTS) &&
            (currentSeason != BAD_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $likelyConditions")

}

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val REQUIRED_AIR_HUMIDITY_IN_PERCENTS = 20
const val BAD_SEASON = "winter"