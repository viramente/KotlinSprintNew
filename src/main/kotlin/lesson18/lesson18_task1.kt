package lesson18

fun main() {

    val good = Crm()
    good.getGoodInfo(1, "шапка")
    good.getGoodInfo(1, listOf("шапка", "шарф", "полотенце"))
}

class Crm() {

    fun getGoodInfo(goodNumber: Int, goodName: String) {
        println("Заказан товар: $goodName")
    }

    fun getGoodInfo(goodNumber: Int, goodName: List<String>) {
        println("Заказаны следующие товары: ${goodName.joinToString(", ")}.")
    }
}