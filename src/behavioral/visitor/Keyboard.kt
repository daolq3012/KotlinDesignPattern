package behavioral.visitor

/**
 * Created by framgia on 11/07/2017.
 */
class Keyboard : ComputerPart {
    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        computerPartVisitor.visit(this)
    }
}
