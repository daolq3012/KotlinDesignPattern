package com.fstyle.java_design_pattern.structural.adapter

/**
 * Created by framgia on 06/07/2017.
 */
class AudioPlayer : MediaPlayer {

  internal var mediaAdapter: MediaAdapter? = null

  override fun play(audioFile: String, fileName: String) {
    if (MediaUtils.isMp3Format(audioFile)) {
      print("Playing Mp4 file. Name: $fileName\n")
    } else if (MediaUtils.isVlcFormat(audioFile) || MediaUtils.isMp4Format(audioFile)) {
      mediaAdapter = MediaAdapter(audioFile)
      mediaAdapter?.play(audioFile, fileName)
    }
  }
}