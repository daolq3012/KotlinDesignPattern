package behavioral.visitor.anothervisitorsample

/**
 * Created by framgia on 11/07/2017.
 */
class Wizard : Human {
    override fun hit(monster: Monster) {
        println("Avada Kedavra! ⚡")
        monster.hitBy(this)
    }
}
