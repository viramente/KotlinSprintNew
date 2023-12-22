package lesson15.task1

fun main() {

    val carp = Fish()
    val seagull = Waterfowl()
    val duck = Waterfowl()

    carp.swim()
    seagull.fly()
    seagull.swim()
    duck.fly()
    duck.swim()

}

interface Swimming {
    fun swim()
}

interface Flying {
    fun fly()
}

open class Bird : Flying {
    override fun fly() {
        println("Летает, как птица")
    }
}

class Waterfowl : Bird(), Swimming {
    override fun swim() {
        println("Плавает, как птица")
    }
}

class Fish : Swimming {
    override fun swim() {
        println("Плавает, как рыба")
    }
}