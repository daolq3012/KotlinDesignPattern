package structural.decorator

/**
 * Created by framgia on 05/07/2017.
 */
class RedShapeDecorator(decoratedShape: Shape) : ShapeDecorator(decoratedShape) {

  override fun draw() {
    decoratedShape.draw()
    setRedBorder(decoratedShape)
  }

  private fun setRedBorder(decoratedShape: Shape) {
    print(" - Border color: Red")
  }
}
