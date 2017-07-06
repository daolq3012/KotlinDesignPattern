package structural.adapter

/**
 * Created by framgia on 06/07/2017.
 */
class MediaAdapter(audioFile: String) : MediaPlayer {

  internal var advanceMediaPlayer: AdvanceMediaPlayer? = null

  init {
    if (MediaUtils.isVlcFormat(audioFile)) {
      advanceMediaPlayer = VlcPlayer()
    } else if (MediaUtils.isMp4Format(audioFile)) {
      advanceMediaPlayer = Mp4Player()
    }
  }

  override fun play(audioFile: String, fileName: String) {
    if (MediaUtils.isVlcFormat(audioFile)) {
      advanceMediaPlayer?.playVlc(
          fileName)
    } else if (MediaUtils.isMp4Format(audioFile)) {
      advanceMediaPlayer?.playMp4(fileName)
    }
  }
}