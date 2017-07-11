package behavioral.iterator

/**
 * Created by framgia on 10/07/2017.
 */
interface ProfileIterator {
    fun hasNext(): Boolean
    fun getNext(): Profile?
    fun reset()
}
