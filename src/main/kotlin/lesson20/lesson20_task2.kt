package lesson20

fun main() {

    val agneshka = PlayerL20T2("Агнешка", 87, 100);

    { player: PlayerL20T2 -> player.currentHealth = player.maxHealth } (agneshka)

    println(agneshka.currentHealth)
}

class PlayerL20T2(val name: String, var currentHealth: Int, val maxHealth: Int)