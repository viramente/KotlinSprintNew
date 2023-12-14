package lesson14.task4

fun main() {

    val koenigsberg = Planet(
        "Кёнигсберг",
        true,
        false,
        listOf(Satellite("Розенау", false, false),
            Satellite("Понарт", false, false),
        )
    )

    println("Планета: ${koenigsberg.name}, " +
            "спутники: ${((koenigsberg
                .listOfSatellites)
                .map {it.name})
                .joinToString (", " )}."
    )
}

open class CelestialBodies (
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBodies(name, hasAtmosphere, isSuitableForLanding)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val listOfSatellites: List<Satellite>,
) : CelestialBodies(name, hasAtmosphere, isSuitableForLanding)