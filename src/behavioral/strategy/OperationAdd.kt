package behavioral.strategy

/**
 * Created by framgia on 07/07/2017.
 */
class OperationAdd : Operator {
    override fun doOperation(a: Int, b: Int): Int {
        return a + b
    }
}
