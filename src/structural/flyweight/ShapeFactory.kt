package com.fstyle.java_design_pattern.structural.flyweight

/**
 * Created by framgia on 06/07/2017.
 */
object ShapeFactory {
  val circleMap: HashMap<String, Shape> = hashMapOf()

  fun getCircle(color: String): Shape {
    var circle: Circle? = circleMap[color] as Circle?

    if (circle == null) {
      circle = Circle(color)
      circleMap.put(color, circle)
      print("Creating circle of color : $color\n")
    }
    return circle
  }
}
