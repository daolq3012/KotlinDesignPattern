package com.fstyle.java_design_pattern.structural.adapter

/**
 * Created by framgia on 06/07/2017.
 */
class Mp4Player : AdvanceMediaPlayer {
  override fun playVlc(filename: String) {
    // Do nothing
  }

  override fun playMp4(filename: String) {
    print("Playing Mp4 file. Name: $filename\n")
  }
}