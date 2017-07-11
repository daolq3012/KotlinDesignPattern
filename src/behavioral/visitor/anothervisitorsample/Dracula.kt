package behavioral.visitor.anothervisitorsample

/**
 * Created by framgia on 11/07/2017.
 */
class Dracula : Monster {
    override fun hitBy(warrior: Warrior) {
        damaged(10)
    }

    override fun hitBy(wizard: Wizard) {
        damaged(80)
    }

    private fun damaged(hp: Int) {
        println("Owie! I lost " + hp + "hp ᙙᙖ")
    }
}
