package lesson21

fun main() {
    val alfa = listOf(2, 4, 5, 2)
    println(alfa.evensCount())
}

fun List<Int>.evensCount(): Int {
    return this.filter { it % 2 == 0 }.sum()
}
