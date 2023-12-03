package lesson8

fun main() {

    val viewsInWeek = intArrayOf(
        VIEWS_IN_SUNDAY,
        VIEWS_IN_MONDAY,
        VIEWS_IN_TUESDAY,
        VIEWS_IN_WEDNESDAY,
        VIEWS_IN_THURSDAY,
        VIEWS_IN_FRIDAY,
        VIEWS_IN_SATURDAY
    )

    var totalViews = 0

    for (views in viewsInWeek) {
        totalViews += views
    }

    println("Всего просмотров за неделю: $totalViews")
}

const val VIEWS_IN_SUNDAY = 12
const val VIEWS_IN_MONDAY = 7
const val VIEWS_IN_TUESDAY = 42
const val VIEWS_IN_WEDNESDAY = 12
const val VIEWS_IN_THURSDAY = 11
const val VIEWS_IN_FRIDAY = 27
const val VIEWS_IN_SATURDAY = 5