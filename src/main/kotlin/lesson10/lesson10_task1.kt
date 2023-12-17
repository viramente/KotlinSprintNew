package lesson10

fun main() {

    val computerRoll = rollDices()
    println("Ходит компьютер, выпадает $computerRoll.")

    val humanRoll = rollDices()
    println("Ходит человек, выпадает $humanRoll.")

    println (when {
        humanRoll > computerRoll -> "Победило человечество."
        humanRoll < computerRoll -> "Победила машина."
        else -> "Ничья."
    })
}

fun rollDices() = (1..6).random()