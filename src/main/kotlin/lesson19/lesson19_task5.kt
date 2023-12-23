package lesson19

fun main() {

    println(INSTRUCTION)

    getListOfPersons()

}

const val INSTRUCTION = "Введите через запятую с пробелом имя и пол человека (мужской, женский, не определен). " +
        "\nВ конце каждой строки нажмите клавишу ввода (Enter)." +
        "\nПосле ввода пяти человек будет выведен список."

enum class Sex(val sexName: String) {
    MALE("мужской"),
    FEMALE("женский"),
    NO_ASSIGNED("не определен")
}

class PersonL19T5(val name: String, val sex: Sex)

fun getListOfPersons() {

    val listOfPerson = mutableListOf<PersonL19T5>()
    repeat(5) {
        val (name, sex) = readln().split(", ")
        listOfPerson.add(PersonL19T5(name, Sex.values().find { it.sexName == sex } ?: Sex.NO_ASSIGNED ))
    }

    listOfPerson.forEach { println("${it.name}, ${it.sex.sexName}") }
}