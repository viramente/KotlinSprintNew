package lesson20

fun main() {
    val andrzej = Robot()
    andrzej.say()
    andrzej.setModifier { sentence: String -> sentence.uppercase() }
    andrzej.say()
}

class Robot() {

    private fun sentencesToSay() = listOf(
        "Вот тебе и поломанный мухожук.",
        "Там точно есть мать-барсучиха?",
        "Я как сюрреалистический сон, но нужны крепкие нервы.",
        "Хочу стать гриффоном, ведущим себя, как кот.",
        "Плыви, любуйся рыбками, ищи акулу.",
    ).random()

    private var modifier: (String) -> String = { string: String -> string }

    fun setModifier(lambda: (String) -> String) {
        modifier = lambda
    }

    fun say() = println(modifier(sentencesToSay()))
}