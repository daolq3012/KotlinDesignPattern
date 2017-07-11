package behavioral.visitor.anothervisitorsample

/**
 * Created by framgia on 11/07/2017.
 */
interface Monster {
    fun hitBy(warrior: Warrior)
    fun hitBy(wizard: Wizard)
}
