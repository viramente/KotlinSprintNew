package lesson2

fun main() {

    val hourOfDeparture = 9
    val minutesOfDeparture = 39
    val travelTimeInMinutes = 457
    val minutesInAnHour = 60

    val absoluteTimeOfDepartureInMinutes = hourOfDeparture * minutesInAnHour + minutesOfDeparture
    val arrivalTimeInMinutes = absoluteTimeOfDepartureInMinutes + travelTimeInMinutes
    val hoursOfArrival = arrivalTimeInMinutes / minutesInAnHour
    val minutesOfArrival = arrivalTimeInMinutes - hoursOfArrival * minutesInAnHour

    print(hoursOfArrival)
    print(':')
    print(minutesOfArrival)

}