package structural.flyweight

/**
 * Created by framgia on 06/07/2017.
 */
class Circle(private var color: String) : Shape {

  private var x: Int = 0
  private var y: Int = 0
  private var radius: Int = 0

  override fun draw() {
    print("Circle: Draw() [Color : $color, x : $x, y :$y, radius :$radius\n")
  }

  fun setX(x: Int) {
    this.x = x
  }

  fun setY(y: Int) {
    this.y = y
  }

  fun setRadius(radius: Int) {
    this.radius = radius
  }
}
