package behavioral.visitor


/**
 * Created by framgia on 11/07/2017.
 */
interface ComputerPartVisitor {
    fun visit(computer: Computer)
    fun visit(mouse: Mouse)
    fun visit(keyboard: Keyboard)
    fun visit(monitor: Monitor)
}
