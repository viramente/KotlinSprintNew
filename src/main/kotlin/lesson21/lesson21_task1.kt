package lesson21

fun main() {
    println("hello".vowelCount())
    println("амброзия".vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = "euoaiуеыаоэяию"
    return this.filter { vowels.contains(it) }.length
}
