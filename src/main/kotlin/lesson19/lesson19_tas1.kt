package lesson19

fun main() {

    println("Вы можете добавить в аквариум такие виды рыб: " +
            "${(FishesL19T1.entries.map {it.getFishes()}).joinToString(", ")}.")

}

enum class FishesL19T1(private val categoryName: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок");

    fun getFishes(): String = categoryName
}