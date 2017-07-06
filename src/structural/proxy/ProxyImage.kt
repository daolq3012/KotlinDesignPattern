package structural.proxy

/**
 * Created by framgia on 06/07/2017.
 */
class ProxyImage(val fileName: String) : Image {

  private var realImage: RealImage? = null

  override fun display() {
    if (realImage == null) {
      realImage = RealImage(fileName)
    }
    realImage?.display()
  }
}
