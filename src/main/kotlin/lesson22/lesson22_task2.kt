package lesson22

fun main() {

    val fire = RegularBookL22T2("Огонь", "Иванов")
    val water = DataBookL22T2("Вода", "Кузнецова")

    println(fire)
    println(fire.hashCode())
    // Выводит "lesson22.RegularBookL22T2@6a5fc7f7",
    // так как для обычного класса функция .toString() зависит от реализации JVM
    // и в данном случае выводит название пакета, название класса, собаку,
    // затем беззнаковое шестнадцатеричное представление хеш-кода объекта.

    println(water)
    // Выводит "DataBookL22T2(name=Вода, author=Кузнецова)", так как
    // для Data класса переопределена функция .toString():
    // она возвращает строку, состоящую из названия класса и свойств,
    // переданных в первичный конструктор, с их значениями через знак "=".

}

class RegularBookL22T2(val name: String, val author: String)

data class DataBookL22T2(val name: String, val author: String)