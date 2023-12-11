package lesson14.task4

fun main() {

    val koenigsberg = Planet("Кёнигсберг", true, false)
    koenigsberg.listOfSatellites = listOf(
        Satellite("Розенау", false, false),
        Satellite("Понарт", false, false),
    )

    println("Планета: ${koenigsberg.name}, " +
            "спутники: ${((koenigsberg
                .listOfSatellites)
                .map {it.name})
                .joinToString (", " )}."
    )
}



abstract class CelestialBodies {
    abstract val name: String
    abstract val hasAtmosphere: Boolean
    abstract val isSuitableForLanding: Boolean
}

class Satellite(
    override val name: String,
    override val hasAtmosphere: Boolean,
    override val isSuitableForLanding: Boolean,
) : CelestialBodies()


class Planet(
    override val name: String,
    override val hasAtmosphere: Boolean,
    override val isSuitableForLanding: Boolean,
) : CelestialBodies() {
    var listOfSatellites = listOf<Satellite>()
}


