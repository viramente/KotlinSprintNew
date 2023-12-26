package lesson22

fun main() {
    val aurorasBirth = GalacticGuide(
        "рождение звезды Аврора",
        "звёздная система Альтас",
        "год: 20452, время: 123:84",
        2_847_921L
    )

    val (name, description) = aurorasBirth
    println("Информация о событии: $name, $description.")
}

data class GalacticGuide(
    val placeOrEventName: String,
    val placeOrEventDescription: String,
    val eventDatAndTime: String,
    val distanceBetweenEarthAndPlaceOrEveningInLightYears: Long,
    )