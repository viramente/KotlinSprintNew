package lesson21

fun main() {

    val player = PlayerL21T3("Lesley", 34, 100)
    println(player.isHealthy())
    player.currentHealth = 100
    println(player.isHealthy())
}


class PlayerL21T3(val name: String, var currentHealth: Int, val maxHealth: Int)

fun PlayerL21T3.isHealthy(): Boolean = currentHealth == maxHealth