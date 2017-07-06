package create.objectpool

import java.util.HashSet

/**
 * Created by Sun on 4/2/2017.
 */

/**
 * Generic object pool
 * @param <T> Type T of Object in the Pool
</T> */
abstract class Pool<T> {

    private val available = HashSet<T>()
    private val inUse = HashSet<T>()

    protected abstract fun create(): T

    /**
     * Checkout object from pool
     */
    @Synchronized fun checkOut(): T {
        if (available.size <= 0) {
            available.add(create())
        }
        val instance = available.iterator().next()
        available.remove(instance)
        inUse.add(instance)
        return instance
    }

    @Synchronized fun checkIn(instance: T) {
        inUse.remove(instance)
        available.add(instance)
    }

    override fun toString(): String {
        return String.format("Pool available=%d inUse=%d", available.size, inUse.size)
    }
}
