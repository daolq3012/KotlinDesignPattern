package structural.proxy

/**
 * Created by framgia on 06/07/2017.
 */
object Proxy {
  @JvmStatic fun main(args: Array<String>) {
    val image = ProxyImage("test.jpg")

    // Image will load from disk
    image.display()
    print("\n")
    // Image will not be loaded from disk
    image.display()
  }
}