package lesson20

fun main() {

    val sentencesToSay = listOf(
        "Вот тебе и поломанный мухожук.",
        "Там точно есть мать-барсучиха?",
        "Я как сюрреалистический сон, но нужны крепкие нервы.",
        "Хочу стать гриффоном, ведущим себя, как кот.",
        "Плыви, любуйся рыбками, ищи акулу.",
    )

    val andrzej = Robot(sentencesToSay)
    andrzej.say()
    andrzej.setModifier { sentence: String -> sentence.uppercase() }
    andrzej.say()
}

class Robot(sentencesToSay: List<String>) {
    private var currentSentence = sentencesToSay.random()

    fun say() = println(currentSentence)

    fun setModifier(lambda: (String) -> String) {
        currentSentence = lambda(currentSentence)
    }
}