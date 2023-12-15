package lesson16

fun main() {

    val order = Order(12, "принят в работу")
    order.askManagerToChangeStatus("перемещен в цех упаковки")

}

class Order(val ordersNumber: Int, _status: String) {

    var status = _status

    private fun changeOrdersStatus(newStatus: String)  {
        status = newStatus
    }

    fun askManagerToChangeStatus(newStatus: String) =
        changeOrdersStatus(newStatus)
}