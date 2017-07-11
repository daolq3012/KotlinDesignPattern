package behavioral.state

/**
 * Created by framgia on 07/07/2017.
 */
object State {
    @JvmStatic fun main(args: Array<String>) {
        val context = Context()

        val startAction = ActionStart()
        startAction.doAction(context)
        println(context.action)

        val stopAction = ActionStop()
        stopAction.doAction(context)
        println(context.action)
    }
}
