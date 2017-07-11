package behavioral.iterator

/**
 * Created by framgia on 10/07/2017.
 */
class SocialSpammer(val network: SocialNetwork) {
    var iterator: ProfileIterator? = null

    fun sendSpamToFriends(profileEmail: String, message: String) {
        print("\nIterating over friends...\n")
        iterator = network.getFriendsIterator(profileEmail)
        while (iterator!!.hasNext()) {
            val profile: Profile? = iterator?.getNext()
            sendMessage(profile, message)
        }
    }

    fun sendSpamToCoworkers(profileEmail: String, message: String) {
        print("\nIterating over friends...\n")
        iterator = network.getCoworkersIterator(profileEmail)
        while (iterator!!.hasNext()) {
            val profile: Profile? = iterator?.getNext()
            sendMessage(profile, message)
        }
    }

    private fun sendMessage(profile: Profile?, message: String) {
        print("Sent message to: '${profile!!.name}', '${profile!!.email}'. Message body: '$message'\n")
    }
}
