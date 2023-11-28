package lesson3

fun main() {

    var startPositionLetter = "E"
    var startPositionNumber = 2
    var finishPositionLetter = "E"
    var finishPositionNumber = 4
    var moviesNumber = 1

    var startPosition = startPositionLetter + startPositionNumber
    var finishPosition = finishPositionLetter + finishPositionNumber

    var movieReport = "$startPosition-$finishPosition:$moviesNumber"
    println(movieReport)

    startPositionLetter = "D"
    startPositionNumber = 2
    finishPositionLetter = startPositionLetter
    finishPositionNumber = startPositionNumber + 1
    moviesNumber = 3

    startPosition = startPositionLetter + startPositionNumber
    finishPosition = finishPositionLetter + finishPositionNumber

    movieReport = "$startPosition-$finishPosition:$moviesNumber"
    println(movieReport)

}