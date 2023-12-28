package lesson22

fun main() {
    val fire1 = RegularBook("Огонь", "Иванов")
    val fire2 = RegularBook("Огонь", "Иванов")

    val fire3 = DataBook("Огонь", "Иванов")
    val fire4 = DataBook("Огонь", "Иванов")

    println(fire1 == fire2)
    // поскольку объект класса не является примитивным типом данных или классом-оболочкой,
    // то .equals() сравнивает ссылки на объекты, поэтому возвращает false

    println(fire3 == fire4)
    // .equals() сравнивает свойства, переданные в первичный конструктор,
    // так как для data class метод .equals() переопределен.
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)