package com.fstyle.java_design_pattern.structural.bridge

/**
 * Created by framgia on 06/07/2017.
 */
class Pentagon(color: Color) : Shape(color) {
  override fun applyColor() {
    print("Pentagon fill with color! ")
    color.applyColor()
  }
}
