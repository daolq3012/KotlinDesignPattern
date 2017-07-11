package behavioral.visitor.anothervisitorsample

/**
 * Created by framgia on 11/07/2017.
 */
class Warrior : Human {
    override fun hit(monster: Monster) {
        println("Let me introduce you: my hammer!!!")
        monster.hitBy(this)
    }
}
