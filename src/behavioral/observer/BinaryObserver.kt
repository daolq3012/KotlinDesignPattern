package behavioral.observer

/**
 * Created by framgia on 10/07/2017.
 */
class BinaryObserver(subject: Subject) : NumberObserver(subject) {

    init {
        subject.attach(this)
    }

    override fun update() {
        print("BinaryObserver update ${subject.state}\n")
    }
}
