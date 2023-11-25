package lesson1

fun main() {

    val secondsInSpace = 6480
    val wholeHours = secondsInSpace / 3600
    val remindedWholeMinutes = (secondsInSpace - wholeHours * 3600) / 60
    val remindedSeconds = secondsInSpace - wholeHours*3600 - remindedWholeMinutes * 60

    val output = "%02d".format(wholeHours) + ':' + "%02d".format(remindedWholeMinutes) + ':' + "%02d".format(remindedSeconds)
    println(output)
}