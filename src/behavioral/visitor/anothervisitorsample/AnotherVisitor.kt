package behavioral.visitor.anothervisitorsample

/**
 * Created by framgia on 11/07/2017.
 */
object AnotherVisitor {
    @JvmStatic fun main(args: Array<String>) {
        val warrior = Warrior()
        val wizard = Wizard()

        val dogie = CuteDogie()
        val dracula = Dracula()

        warrior.hit(dogie)
        wizard.hit(dogie)

        warrior.hit(dracula)
        wizard.hit(dracula)
    }
}
