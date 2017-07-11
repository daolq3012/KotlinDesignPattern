package behavioral.visitor

/**
 * Created by framgia on 11/07/2017.
 */
class ComputerPartDisplayVisitor : ComputerPartVisitor {
    override fun visit(computer: Computer) {
        print("Displaying Computer.\n")
    }

    override fun visit(mouse: Mouse) {
        print("Displaying Mouse.\n")
    }

    override fun visit(keyboard: Keyboard) {
        print("Displaying Keyboard.\n")
    }

    override fun visit(monitor: Monitor) {
        print("Displaying Monitor.\n")
    }
}
