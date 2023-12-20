package lesson19

fun main() {

    println("Вы можете добавить в аквариум такие виды рыб: " +
            "${(FishesL19T1.entries.map {it.getFishes()}).joinToString(", ")}.")

}

enum class FishesL19T1() {
    GUPPY {
        override fun getFishes() = "гуппи"
    },
    ANGELFISH {
        override fun getFishes() = "скалярия"
    },
    GOLDFISH {
        override fun getFishes() = "золотая рыбка"
    },
    SIAMESE_FIGHTING_FISH {
        override fun getFishes() = "петушок"
    };

    abstract fun getFishes(): String
}