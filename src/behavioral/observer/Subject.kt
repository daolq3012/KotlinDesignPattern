package behavioral.observer

/**
 * Created by framgia on 10/07/2017.
 */
class Subject {
    private val observers = ArrayList<NumberObserver>()
    var state: Int = 0
        set(state) {
            field = state
            notifyAllObservers()
        }

    fun attach(observer: NumberObserver) {
        observers.add(observer)
    }

    fun notifyAllObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}
