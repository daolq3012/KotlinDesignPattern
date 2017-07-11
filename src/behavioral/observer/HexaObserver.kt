package behavioral.observer

/**
 * Created by framgia on 10/07/2017.
 */
class HexaObserver(subject: Subject) : NumberObserver(subject) {

    init {
        subject.attach(this)
    }

    override fun update() {
        print("HexaObserver update ${subject.state}\n")
    }
}
