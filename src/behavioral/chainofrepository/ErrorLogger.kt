package behavioral.chainofrepository

/**
 * Created by framgia on 11/07/2017.
 */
class ErrorLogger(level: Int) : AbstractLogger(level = level) {
    override fun write(message: String) {
        print("Error Console::Logger: $message\n")
    }
}
