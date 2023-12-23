package lesson20

fun main() {

    val agneshka = PlayerL20T2("Агнешка", false)
    val nargiz = PlayerL20T2("Наргиз", true)

    val openDoor = { player: PlayerL20T2 ->
        println (if (player.hasKey) "${player.name}, вы открыли дверь."
        else ("${player.name}, дверь заперта."))
    }

    openDoor(agneshka)
    openDoor(nargiz)

}

class PlayerL20T2(val name: String, val hasKey: Boolean)