package com.fstyle.java_design_pattern.create.factorymethod

import create.factorymethod.Circle
import create.factorymethod.Rectangle
import create.factorymethod.Shape

/**
 * Created by framgia on 05/07/2017.
 */
object FactoryMethod {
  @JvmStatic fun main(args: Array<String>) {
    var shape: Shape = Circle(2f)
    print("circle: " + shape.calculateArea())
    shape = Rectangle(3f, 2f)
    print("\nRectangle: " + shape.calculateArea() + "\n\n")
  }
}