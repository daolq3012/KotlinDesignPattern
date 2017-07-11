package behavioral.command

/**
 * Created by framgia on 07/07/2017.
 */
class BuyStock(val stock: Stock) : Order {
    override fun execute() {
        stock.buy()
    }
}
