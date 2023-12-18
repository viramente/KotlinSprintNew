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

open class Tamagotchi(val name: String, private val action: String) {

    fun eat() {
        println("$name - $action")
    }

    fun play() {
        println("$name - играет")
    }

    fun sleep() {
        println("$name - спит")
    }
}

class Fox(name: String, action: String = "ест ягоды") : Tamagotchi(name, action)
class Dog(name: String, action: String = "ест кости") : Tamagotchi(name, action)
class Cat(name: String, action: String = "ест рыбу") : Tamagotchi(name, action)