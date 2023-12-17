package lesson17

fun main() {

    val quiz = Quiz("Сколько ног у осьминога?", "Восемь.")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "Девять."
    println(quiz.answer)

}


class Quiz(
    question: String,
    answer: String
) {
    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value: String) {
            field = value
        }
}