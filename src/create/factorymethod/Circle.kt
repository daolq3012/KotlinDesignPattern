package create.factorymethod

/**
 * Created by Sun on 4/2/2017.
 */

class Circle(private val r: Float) : Shape {

    override fun calculateArea(): Float {
        return r * r * 3.14f
    }
}
