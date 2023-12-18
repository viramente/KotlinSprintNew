package lesson17

fun main() {

    val packageLes17 = Package(1, "Варшава")
    packageLes17.currentPlace = "Гданьск"
    packageLes17.currentPlace = "Ольштын"

    println(packageLes17.currentPlace)
    println(packageLes17.movingCounter())

}

class Package(val number: Int, _currentPlace: String) {

    private var _movingCounter: Int = 1
    fun movingCounter() = _movingCounter

    var currentPlace = _currentPlace
        get() = field
        set(value) {
            _movingCounter++
            field = value
        }
}