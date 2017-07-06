package com.fstyle.java_design_pattern.structural.adapter

/**
 * Created by framgia on 06/07/2017.
 */
class MediaUtils private constructor() {
  companion object {

    fun isMp3Format(audioFile: String): Boolean {
      return audioFile.equals("mp3", ignoreCase = true)
    }

    fun isVlcFormat(audioFile: String): Boolean {
      return audioFile.equals("vlc", ignoreCase = true)
    }

    fun isMp4Format(audioFile: String): Boolean {
      return audioFile.equals("mp4", ignoreCase = true)
    }
  }
}