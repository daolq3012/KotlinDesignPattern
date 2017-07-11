package behavioral.visitor.anothervisitorsample

/**
 * Created by framgia on 11/07/2017.
 */
class CuteDogie : Monster {
    override fun hitBy(warrior: Warrior) {
        damaged(50)
    }

    override fun hitBy(wizard: Wizard) {
        damaged(10)
    }

    private fun damaged(hp: Int) {
        println("Woof! I lost " + hp + "hp (❍ᴥ❍ʋ)")
    }
}
