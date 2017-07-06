package structural.decorator

/**
 * Created by framgia on 05/07/2017.
 */
object Decorator {
  @JvmStatic fun main(args: Array<String>) {
    val circle: Shape = Circle()

    val redCircle: Shape = RedShapeDecorator(Circle())
    val redRectangle: Shape = RedShapeDecorator(Rectangle())

    print("Circle with normal border: ")
    circle.draw()

    print("\nCircle of red border: ")
    redCircle.draw()

    print("\nRect with red border: ")
    redRectangle.draw()
  }
}
