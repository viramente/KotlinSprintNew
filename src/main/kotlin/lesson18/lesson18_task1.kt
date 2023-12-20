package lesson18

fun main() {

    val good = Order()
    good.getGoodInfo(1, "шапка")
    good.getGoodInfo(1, listOf("шапка", "шарф", "полотенце"))
}

class Order() {

    fun getGoodInfo(goodNumber: Int, goodName: String) {
        println("Заказан товар: $goodName")
    }

    fun getGoodInfo(goodNumber: Int, goodName: List<String>) {
        println("Заказаны следующие товары: ${goodName.joinToString(", ")}.")
    }
}