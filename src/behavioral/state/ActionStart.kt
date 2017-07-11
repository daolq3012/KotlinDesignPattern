package behavioral.state

/**
 * Created by framgia on 07/07/2017.
 */
class ActionStart : Action {
    override fun doAction(context: Context) {
        print("Player is in start!\n")
        context.action = this
    }

    override fun toString(): String {
        return "Start state"
    }
}
