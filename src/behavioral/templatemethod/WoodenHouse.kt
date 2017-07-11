package behavioral.templatemethod

/**
 * Created by framgia on 11/07/2017.
 */
class WoodenHouse : HouseTemplate() {
    override fun initiation() {
        print("Start build wooden house : \n")
    }

    override fun buildPillars() {
        print("Building pillars with wood coating\n")
    }

    override fun buildWalls() {
        print("Building wooden walls\n")
    }

    override fun buildWindows() {
        print("Building wooden windows\n")
    }
}
