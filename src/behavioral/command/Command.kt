package behavioral.command

/**
 * Created by framgia on 07/07/2017.
 */
object Command {
    @JvmStatic fun main(args: Array<String>) {
        val stock = Stock()

        val buyStockOrder = BuyStock(stock = stock)
        val sellStock = SellStock(stock)

        val broker = Broker()
        broker.takeOrders(buyStockOrder)
        broker.takeOrders(sellStock)

        broker.placeOrders()
    }
}
