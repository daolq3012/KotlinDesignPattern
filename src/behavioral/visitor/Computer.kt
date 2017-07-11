package behavioral.visitor

/**
 * Created by framgia on 11/07/2017.
 */
class Computer : ComputerPart {

    var parts: Array<ComputerPart>? = null

    init {
        parts = arrayOf(Mouse(), Keyboard(), Monitor())
    }

    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        for (i in 0 until parts!!.size step 1) {
            parts!![i].accept(computerPartVisitor)
        }
        computerPartVisitor.visit(this)
    }
}
