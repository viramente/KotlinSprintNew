package lesson16

fun main() {

    val darkEye = PlayerLes16Task5("Dark Eye", 50, 13)
    val princeOfChelsea = PlayerLes16Task5("Prince of Chelsea", 100, 22)

    darkEye.takeDamage(princeOfChelsea.getPunchStrength())
    darkEye.takeDamage(princeOfChelsea.getPunchStrength())
    princeOfChelsea.takeDamage(darkEye.getPunchStrength())
    darkEye.treat(10)
    princeOfChelsea.takeDamage(darkEye.getPunchStrength())
    princeOfChelsea.treat(100)
    darkEye.takeDamage(princeOfChelsea.getPunchStrength())
    darkEye.treat(100)
    darkEye.takeDamage(princeOfChelsea.getPunchStrength())
}

class PlayerLes16Task5(val name: String, _health: Int, _punchStrength: Int) {

    private var health = _health
    private val maxHealth = _health

    private var punchStrength = _punchStrength

    fun getPunchStrength() = punchStrength

    private var isAlive = true

    private fun finishGame() = println("Игрок $name погиб. Навсегда.")

    fun takeDamage(damage: Int) {
        if (isAlive) {
            if (health <= damage) {
                health = 0
                punchStrength = 0
                isAlive = false
                finishGame()
            } else {
                health -= damage
                println("$name получил урон ${damage}. Его здоровье: $health.")
            }
        } else println("Зря тратите силы. Мёртвый $name уже не опасен.")
    }

    fun treat(healthPoints: Int) {
        if (isAlive) {
            if (health + healthPoints < maxHealth) {
                health += healthPoints
                println("$name смог подлечиться на $healthPoints пунктов, и теперь его здоровье: $health.")
            } else {
                health = maxHealth
                println("$name полностью вылечен, его здоровье: $health.")
            }
        } else println("Попытка лечения $name не удалась. Он мёртв.")
    }
}