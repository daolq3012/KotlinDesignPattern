import create.singleton.SimpleSingleton

/**
 * Created by framgia on 05/07/2017.
 */
object Singleton {
  @JvmStatic fun main(args: Array<String>) {
    val simpleSingleton = SimpleSingleton.getInstance()
  }
}