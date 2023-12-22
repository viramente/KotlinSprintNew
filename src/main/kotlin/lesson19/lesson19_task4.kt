package lesson19

fun main() {
    val tank = Tank()
    tank.getCurrentShell()
    tank.shoot()

    tank.loadShell("синий")
    tank.shoot()

    tank.loadShell("красный")
    tank.shoot()

    tank.loadShell("злёный")
    tank.shoot()
}

enum class Shell(val punchStrength: Int, val typeName: String) {
    BLUE(5, "синий"),
    GREEN(10, "зелёный"),
    RED(20, "красный"),
    NO_SHELL(0, "нет снарядов"),
}

class Tank() {

    private var currentShell = Shell.NO_SHELL

    fun getCurrentShell() = println("Заряжен снаряд: ${currentShell.typeName}.")

    fun loadShell(shellType: String) {

        val correspondingShell = Shell.entries.find { it.typeName == shellType }

        if (correspondingShell != null) {
            println("Установлен ${correspondingShell.typeName} снаряд.")
            currentShell = correspondingShell
        } else {
            println("Запрошен снаряд, которого нет на вооружении. Заряжен текущий снаряд.")
        }
    }

    fun shoot() = println("Нанесён урон: ${currentShell.punchStrength}.")
}