package structural.decorator

/**
 * Created by framgia on 05/07/2017.
 */

abstract class ShapeDecorator(protected var decoratedShape: Shape) : Shape {

    override fun draw() {
        decoratedShape.draw()
    }
}
