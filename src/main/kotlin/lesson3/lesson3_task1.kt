package lesson3

fun main() {

    var userName = "User Name"
    val greetingAfternoon = "good afternoon!"
    val greetingEvening = "good evening!"

    var greetingText = "$userName, $greetingAfternoon"
    println(greetingText)

    greetingText = "$userName, $greetingEvening"
    println(greetingText)

}