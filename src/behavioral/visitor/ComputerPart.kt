package behavioral.visitor

/**
 * Created by framgia on 11/07/2017.
 */
interface ComputerPart {
    fun accept(computerPartVisitor: ComputerPartVisitor)
}
