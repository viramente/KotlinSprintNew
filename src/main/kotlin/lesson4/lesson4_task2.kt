package lesson4

fun main() {

    var weight = 20
    var volume = 80

    println ("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= REQUIRED_MIN_WEIGHT_CLOSED) && (weight <= REQUIRED_MAX_WEIGHT_CLOSED) && (volume < REQUIRED_MAX_VOLUME_OPEN)}")

    weight = 50
    volume = 100

    println ("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight >= REQUIRED_MIN_WEIGHT_CLOSED) && (weight <= REQUIRED_MAX_WEIGHT_CLOSED) && (volume < REQUIRED_MAX_VOLUME_OPEN)}")
}

const val REQUIRED_MIN_WEIGHT_CLOSED = 35
const val REQUIRED_MAX_WEIGHT_CLOSED = 100
const val REQUIRED_MAX_VOLUME_OPEN = 100