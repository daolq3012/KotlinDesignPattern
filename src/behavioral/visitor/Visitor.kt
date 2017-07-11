package behavioral.visitor

/**
 * Created by framgia on 11/07/2017.
 */
object Visitor {
    @JvmStatic fun main(args: Array<String>) {
        val computer = Computer()
        computer.accept(ComputerPartDisplayVisitor())
    }
}
