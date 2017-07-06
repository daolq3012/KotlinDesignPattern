package structural.adapter

/**
 * Created by framgia on 06/07/2017.
 */
class VlcPlayer : AdvanceMediaPlayer {
    override fun playVlc(filename: String) {
        print("Playing vlc file. Name: $filename\n")
    }

    override fun playMp4(filename: String) {
        // do nothing
    }
}
