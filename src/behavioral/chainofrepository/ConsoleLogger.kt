package behavioral.chainofrepository

/**
 * Created by framgia on 11/07/2017.
 */
class ConsoleLogger(level: Int) : AbstractLogger(level) {
    override fun write(message: String) {
        print("Standard Console::Logger: $message\n")
    }
}
