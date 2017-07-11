package behavioral.chainofrepository

/**
 * Created by framgia on 11/07/2017.
 */
class FileLogger(level: Int) : AbstractLogger(level) {
    override fun write(message: String) {
        print("File::Logger: $message\n")
    }
}
