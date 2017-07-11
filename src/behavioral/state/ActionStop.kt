package behavioral.state

/**
 * Created by framgia on 07/07/2017.
 */
class ActionStop : Action {
    override fun doAction(context: Context) {
        print("Player is in stop!\n")
        context.action = this
    }

    override fun toString(): String {
        return "Stop state"
    }
}
