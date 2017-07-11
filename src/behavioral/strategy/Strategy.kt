package behavioral.strategy

import java.io.BufferedReader
import java.io.InputStreamReader


/**
 * Created by framgia on 07/07/2017.
 */
object Strategy {
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var context: Context? = null

    @JvmStatic fun main(args: Array<String>) {
        var continueChoice: String
        do {
            print("Select a operator:" + "\n" +
                    "1 - Add" + "\n" +
                    "2 - Sub" + "\n" +
                    "3 - Multi" + "\n")
            val choice = Integer.parseInt(reader.readLine())
            when (choice) {
                1 -> context = Context(OperationAdd())
                2 -> context = Context(OperationSubstract())
                3 -> context = Context(OperationMultiply())
                else -> {
                    return
                }
            }
            print("Input first number: \n")
            val firstNum = Integer.parseInt(reader.readLine())
            print("Input second number: \n")
            val secondNum = Integer.parseInt(reader.readLine())
            print("Result: ${context?.executeStrategy(firstNum, secondNum)}\n")
            print("You wish to continue selection? Y/N: ")
            continueChoice = reader.readLine()
        } while (continueChoice.equals("Y", ignoreCase = true))
    }
}
