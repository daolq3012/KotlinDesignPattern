package behavioral.memento

/**
 * Created by framgia on 11/07/2017.
 */
class CareTaker {
    val mementos = ArrayList<MementoSample>()

    fun add(memento: MementoSample) {
        mementos.add(memento)
    }

    fun get(index: Int): MementoSample {
        return mementos[index]
    }
}
