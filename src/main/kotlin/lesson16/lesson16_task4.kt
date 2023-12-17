package lesson16

fun main() {

    val order = Order(12, "принят в работу")
    order.askManagerToChangeStatus("перемещен в цех упаковки")
    order.getStatus()

}

class Order(val ordersNumber: Int, _status: String) {

    private var status = _status

    private fun changeOrdersStatus(newStatus: String)  {
        status = newStatus
    }

    fun askManagerToChangeStatus(newStatus: String) =
        changeOrdersStatus(newStatus)

    fun getStatus() = println("Заказ $ordersNumber $status.")
}