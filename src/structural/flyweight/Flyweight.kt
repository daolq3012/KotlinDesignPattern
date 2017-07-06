package com.fstyle.java_design_pattern.structural.flyweight

/**
 * Created by framgia on 06/07/2017.
 */
object Flyweight {
  val colors: Array<String> = arrayOf("Red", "Green", "Blue", "White", "Black")

  @JvmStatic fun main(args: Array<String>) {
    for (i in 0..20) run {
      val circle: Circle = ShapeFactory.getCircle(getRandomColor()) as Circle
      circle?.setX(getRandomX())
      circle?.setY(getRandomY())
      circle?.setRadius(100)
      circle?.draw()
    }
  }

  fun getRandomColor(): String {
    return colors[(Math.random() * colors.size).toInt()]
  }

  fun getRandomX(): Int {
    return (Math.random() * 100).toInt()
  }

  fun getRandomY(): Int {
    return (Math.random() * 100).toInt()
  }
}
