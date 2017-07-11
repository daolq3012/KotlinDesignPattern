package behavioral.templatemethod

/**
 * Created by framgia on 11/07/2017.
 */
abstract class HouseTemplate {

    private fun buildFoundation() {
        print("Building foundation with cement, iron rods and sand\n")
    }

    abstract fun buildPillars()

    abstract fun buildWalls()

    abstract fun buildWindows()


    fun build() {
        initiation()

        buildFoundation()

        buildPillars()

        buildWalls()

        buildWindows()

        print("Build complete!\n\n")
    }

    abstract fun initiation()
}
