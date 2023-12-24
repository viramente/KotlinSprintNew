package lesson19

fun main() {
    val tank = Tank()
    tank.getCurrentShell()
    tank.shoot()

    tank.loadShell(Shell.BLUE)
    tank.shoot()

    tank.loadShell(Shell.RED)
    tank.shoot()

    tank.loadShell(Shell.GREEN)
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

    fun loadShell(shellType: Shell) {
            println("Установлен ${shellType.typeName} снаряд.")
            currentShell = shellType
    }

    fun shoot() = println("Нанесён урон: ${currentShell.punchStrength}.")
}