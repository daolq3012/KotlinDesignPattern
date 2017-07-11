package behavioral.command

/**
 * Created by framgia on 07/07/2017.
 */
class Broker {
    private val orders: MutableList<Order> = arrayListOf()

    fun takeOrders(order: Order) {
        orders.add(order)
    }

    fun placeOrders() {
        orders.forEach({ order -> order.execute() })
        orders.clear()
    }
}
