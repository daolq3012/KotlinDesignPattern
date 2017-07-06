package create.abstractfactory

/**
 * Created by Sun on 4/2/2017.
 */

class Rectangle(private val length: Float, private val width: Float) : Shape() {

    override fun calculateArea(): Float {
        return length * width
    }
}
