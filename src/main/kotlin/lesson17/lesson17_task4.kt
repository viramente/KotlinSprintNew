package lesson17

fun main() {

    val packageLes17 = Package("Варшава")
    packageLes17.currentPlace = "Гданьск"
    packageLes17.currentPlace = "Ольштын"

    println(packageLes17.currentPlace)
    println(packageLes17.movingCounter)
}

class Package(currentPlace: String, movingCounter: Int = 1) {

    var movingCounter: Int = movingCounter
        private set

    var currentPlace = currentPlace
        set(value) {
            movingCounter++
            field = value
        }
}