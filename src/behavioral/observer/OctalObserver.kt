package behavioral.observer

/**
 * Created by framgia on 10/07/2017.
 */
class OctalObserver(subject: Subject) : NumberObserver(subject) {

    init {
        subject.attach(this)
    }

    override fun update() {
        print("OctalObserver update ${subject.state}\n")
    }
}