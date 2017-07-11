package behavioral.iterator

import java.util.*


/**
 * Created by framgia on 10/07/2017.
 */
object Iterator {

    val scanner: Scanner = Scanner(System.`in`)

    @JvmStatic fun main(args: Array<String>) {
        print("Please specify social network to target spam tool (default:Facebook):\n")
        print("1. Facebook\n")
        print("2. LinkedIn\n")

        val choice = scanner.nextLine()

        var network: SocialNetwork

        if (choice == "1") {
            network = FaceBook(createTestProfiles())
        } else if (choice == "2") {
            network = LinkedIn(createTestProfiles())
        } else {
            return
        }
        val spammer = SocialSpammer(network = network)
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?")
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would ne interested in [link].")
    }

    fun createTestProfiles(): List<Profile> {
        val data = ArrayList<Profile>()
        data.add(Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"))
        data.add(Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"))
        data.add(Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"))
        data.add(Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"))
        data.add(Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"))
        data.add(Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"))
        return data
    }
}
