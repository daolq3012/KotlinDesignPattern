package create.objectpool

/**
 * Created by framgia on 05/07/2017.
 */
object ObjectPool {

    @JvmStatic fun main(args: Array<String>) {
        val personalPool: PersonPool = PersonPool()
        print(personalPool.checkOut().toString())
    }
}
