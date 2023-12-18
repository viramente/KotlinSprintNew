package lesson18

fun main() {

    val fox: Tamagotchi = Fox("Альберта")
    val dog: Tamagotchi = Dog("Помидор")
    val cat: Tamagotchi = Cat("Миша")

    fox.sleep()
    dog.sleep()
    cat.sleep()

    fox.eat()
    dog.eat()
    cat.eat()

    fox.play()
    dog.play()
    cat.play()

}

open class Tamagotchi(val name: String, private val feed: String) {

    fun eat() {
        println("$name - $feed")
    }

    fun play() {
        println("$name - играет")
    }

    fun sleep() {
        println("$name - спит")
    }
}

class Fox(name: String, feed: String = "ест ягоды") : Tamagotchi(name, feed)
class Dog(name: String, feed: String = "ест кости") : Tamagotchi(name, feed)
class Cat(name: String, feed: String = "ест рыбу") : Tamagotchi(name, feed)