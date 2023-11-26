package lesson4

fun main() {

    val sunny = true
    val tent = true
    val airHumidityInPercents = 20
    val currentSeason = "winter"

    val likelyConditions = sunny && tent && (airHumidityInPercents == 20) && (currentSeason != "winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $likelyConditions")

}