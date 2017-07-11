package behavioral.command

/**
 * Created by framgia on 07/07/2017.
 */
class Stock {
    val name = "ABC"
    val quantity = 10

    fun buy() {
        print("Stock [ Name: $name, Quantity: $quantity ] bought\n")
    }

    fun sell() {
        System.out.println("Stock [ Name: $name, Quantity: $quantity ] sold\n")
    }
}
