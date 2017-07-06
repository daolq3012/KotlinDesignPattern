import create.abstractfactory.Circle
import create.abstractfactory.Rectangle
import create.abstractfactory.Shape

/**
 * Created by framgia on 05/07/2017.
 */

object AbstractFactory {

  @JvmStatic fun main(args: Array<String>) {
    var shape: Shape = Circle(2f)
    print("abstractFactoryClicked-Circle: ${shape.calculateArea()}")
    shape = Rectangle(2f, 3f)
    print("\nabstractFactoryClicked-Rectangle: ${shape.calculateArea()} \n\n")
  }
}
