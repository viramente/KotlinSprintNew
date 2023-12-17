package lesson17

fun main() {

    val ship = Ship("Long Joe", 14, "Lusitania")
    ship.name = "Coimbra"

}

class Ship (_name: String, var averageSpeed: Int, var homePort: String) {

    var name = _name
        get() = field
        set(value) {
            println("Имя корабля нельзя изменить.")
        }
}