package behavioral.memento

/**
 * Created by framgia on 11/07/2017.
 */
class Originator {
    var state: String? = null

    fun saveStateToMemento(): MementoSample {
        return MementoSample(state!!)
    }

    fun getStateFromMemento(memento: MementoSample) {
        state = memento.state
    }
}
