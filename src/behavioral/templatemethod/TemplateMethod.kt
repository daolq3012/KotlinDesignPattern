package behavioral.templatemethod

/**
 * Created by framgia on 10/07/2017.
 */
object TemplateMethod {
    @JvmStatic fun main(args: Array<String>) {
        var house: HouseTemplate = WoodenHouse()

        house.build()

        house = ConcreteHouse()
        house.build()
    }
}
