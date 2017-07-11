package behavioral.chainofrepository

/**
 * Created by framgia on 11/07/2017.
 */
abstract class AbstractLogger(var level: Int) {

    object TYPE {
        val INFO = 1
        val DEBUG = 2
        val ERROR = 3
    }

    var nextLogger: AbstractLogger? = null

    abstract fun write(message: String)

    fun logMessage(level: Int, message: String) {
        if (this.level <= level) {
            write(message = message)
        }
        nextLogger?.logMessage(level, message)
    }
}
