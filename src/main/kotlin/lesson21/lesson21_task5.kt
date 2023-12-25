package lesson21

fun main() {
    val characteristics = mapOf(
        "ловкость" to 34,
        "сила" to 68,
        "ум" to 76,
        "рисование" to 12,
        "танцы" to 76)

    println(characteristics.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val maxPoints = this.values.max()
    val maxPointsCharacteristics = (this.filter { it.value == maxPoints }).map { it.key }
    return maxPointsCharacteristics.random()
}