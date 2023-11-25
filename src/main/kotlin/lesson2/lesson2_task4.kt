package lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffInPercents = 20

    val buffForCrystalOre = buffInPercents * crystalOre / 100
    val buffForIronOre = buffInPercents * ironOre / 100

    val outputForCrystalOre = "+$buffForCrystalOre to crystal ore!"

    val outputForIronOre = "+$buffForIronOre to iron ore!"

    println(outputForCrystalOre)
    println(outputForIronOre)

}