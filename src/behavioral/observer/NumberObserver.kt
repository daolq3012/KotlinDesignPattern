package behavioral.observer

/**
 * Created by framgia on 10/07/2017.
 */
abstract class NumberObserver constructor(var subject: Subject) {
    abstract fun update()
}
