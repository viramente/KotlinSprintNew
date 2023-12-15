package lesson16

fun main() {

    val darkEye = PlayerLes16Task5("Dark Eye", 50, 13)
    val princeOfChelsea = PlayerLes16Task5("Prince of Chelsea", 100, 22)

    darkEye.getLosses(princeOfChelsea)
    darkEye.getLosses(princeOfChelsea)
    princeOfChelsea.getLosses(darkEye)
    darkEye.treat(10)
    princeOfChelsea.getLosses(darkEye)
    princeOfChelsea.treat(100)
    darkEye.getLosses(princeOfChelsea)
    darkEye.treat(100)
    darkEye.getLosses(princeOfChelsea)
}

class PlayerLes16Task5(val name: String, _health: Int, _punchStrength: Int) {

    private var health = _health
    private val maxHealth = _health

    private var punchStrength = _punchStrength

    private var isAlive = true

    private fun andTheGame() = println("Игрок $name погиб. Навсегда.")

    fun getLosses(enemy: PlayerLes16Task5) {
        if (isAlive) {
            if (health <= enemy.punchStrength) {
                health = 0
                punchStrength = 0
                isAlive = false
                andTheGame()
            } else {
                health -= enemy.punchStrength
                println("$name получил урон ${enemy.punchStrength}. Его здоровье: $health.")
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