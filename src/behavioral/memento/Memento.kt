package behavioral.memento

/**
 * Created by framgia on 11/07/2017.
 */
object Memento {
    @JvmStatic fun main(args: Array<String>) {
        val originator = Originator()
        val careTaker = CareTaker()

        originator.state = "State #1"
        originator.state = "State #2"
        careTaker.add(originator.saveStateToMemento())

        originator.state = "State #3"
        careTaker.add(originator.saveStateToMemento())

        originator.state = "State #4"
        print("Current State: ${originator.state!!}\n")

        originator.getStateFromMemento(careTaker.get(0))
        print("First saved State: ${originator.state!!}\n")
        originator.getStateFromMemento(careTaker.get(1))
        print("Second saved State: ${originator.state!!}\n")
    }
}
