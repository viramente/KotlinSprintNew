package lesson19

fun main() {

    val coat = GoodL19T2("пальто", 1432, OnlineStore.CLOTHING)
    coat.getGoodInfo()

    val scissors = GoodL19T2("ножницы", 12, OnlineStore.STATIONERY)
    scissors.getGoodInfo()

    val flashLight = GoodL19T2("карманный фонарик", 825, OnlineStore.MISCELLANEOUS)
    flashLight.getGoodInfo()

}

enum class OnlineStore(private val categoryName: String) {
    CLOTHING("одежда"),
    STATIONERY("канцелярские товары"),
    MISCELLANEOUS("разное");

    fun getName(): String = categoryName
}


class GoodL19T2(private val name: String, private val id: Int, private val category: OnlineStore) {
    fun getGoodInfo() = println(
        """
        Информация о товаре:
          название: $name,
          id: $id,
          категория: ${category.getName()}.
        """.trimIndent()
    )
}