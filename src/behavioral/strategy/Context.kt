package behavioral.strategy

/**
 * Created by framgia on 07/07/2017.
 */
class Context(var operator: Operator) {

    fun executeStrategy(a: Int, b: Int): Int {
        return operator.doOperation(a, b)
    }
}
