package lesson4

fun main() {

    var weight = 20
    var volume = 80

    println ("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= 35) && (weight <= 100) && (volume < 100)}")

    weight = 50
    volume = 100

    println ("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= 35) && (weight <= 100) && (volume < 100)}")
}