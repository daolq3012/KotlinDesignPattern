package com.fstyle.java_design_pattern.structural.proxy

/**
 * Created by framgia on 06/07/2017.
 */
class RealImage(private val filename: String) : Image {

  init {
    loadFromDisk(filename)
  }

  override fun display() {
    print("Display $filename\n")
  }

  private fun loadFromDisk(filename: String) {
    print("Loading $filename\n")
  }
}
