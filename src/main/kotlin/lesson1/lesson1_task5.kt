package lesson1

fun main() {

    val secondsInSpace = 6480
    val wholeHours = secondsInSpace / 3600
    val remindedWholeMinutes = (secondsInSpace - wholeHours * 3600) / 60
    val remindedSeconds =  secondsInSpace - wholeHours*3600 - remindedWholeMinutes * 60

    print(0)
    print(wholeHours)
    print(':')
    print(remindedWholeMinutes)
    print(':')
    print(remindedSeconds)
    print(0)
}