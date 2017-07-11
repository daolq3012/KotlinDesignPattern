package behavioral.observer

/**
 * Created by framgia on 10/07/2017.
 */
object Observer {
    @JvmStatic fun main(args: Array<String>) {
        val subject = Subject()

        BinaryObserver(subject = subject)
        OctalObserver(subject = subject)
        HexaObserver(subject = subject)

        subject.notifyAllObservers()
        print("----------------------------------\n")
        subject.state = 4
    }
}
