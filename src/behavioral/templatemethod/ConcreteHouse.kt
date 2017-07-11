package behavioral.templatemethod

/**
 * Created by framgia on 11/07/2017.
 */
class ConcreteHouse : HouseTemplate() {
    override fun initiation() {
        print("Start build concrete house : \n")
    }

    override fun buildPillars() {
        print("Building pillars with cement, iron rods, sand\n")
    }

    override fun buildWalls() {
        print("Building concrete walls\n")
    }

    override fun buildWindows() {
        print("Building windows with wood, glass\n")
    }
}
