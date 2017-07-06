package structural.bridge

/**
 * Created by framgia on 06/07/2017.
 */
object Bridge {
    @JvmStatic fun main(args: Array<String>) {
        val triAngle: Shape = Triangle(RedColor())
        triAngle.applyColor()
        val pentagon: Shape = Pentagon(GreenColor())
        pentagon.applyColor()
    }
}
