package behavioral.chainofrepository

/**
 * Created by framgia on 11/07/2017.
 */
object ChainOfRepository {
    @JvmStatic fun main(args: Array<String>) {
        val loggerChain = getChainOfLoggers()

        loggerChain.logMessage(AbstractLogger.TYPE.INFO,
                "This is an information.\n")

        loggerChain.logMessage(AbstractLogger.TYPE.DEBUG,
                "This is an debug level\n")

        loggerChain.logMessage(AbstractLogger.TYPE.ERROR,
                "This is an error\n")
    }

    private fun getChainOfLoggers(): AbstractLogger {

        val errorLogger = ErrorLogger(AbstractLogger.TYPE.ERROR)
        val fileLogger = FileLogger(AbstractLogger.TYPE.DEBUG)
        val consoleLogger = ConsoleLogger(AbstractLogger.TYPE.INFO)

        errorLogger.nextLogger = fileLogger
        fileLogger.nextLogger = consoleLogger

        return errorLogger
    }
}
