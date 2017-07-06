package structural.bridge

/**
 * Created by framgia on 06/07/2017.
 */
class Triangle(color: Color) : Shape(color) {
    override fun applyColor() {
        print("Triangle filled with color! ")
        color.applyColor()
    }
}
