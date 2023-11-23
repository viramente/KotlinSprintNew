package lesson2

fun main() {

    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val travelTimeInMinutes = 457

    val absoluteTimeOfDepartureInMinutes = hourOfDeparture * 60 + minutesOfDeparture
    val arrivalTimeInMinutes = absoluteTimeOfDepartureInMinutes + travelTimeInMinutes
    val hoursOfArrival = arrivalTimeInMinutes / 60
    val minutesOfArrival = arrivalTimeInMinutes - hoursOfArrival*60

    print(hoursOfArrival)
    print(':')
    print(minutesOfArrival)

}