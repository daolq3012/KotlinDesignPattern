package behavioral.iterator

/**
 * Created by framgia on 10/07/2017.
 */
class LinkedIn(var profiles: List<Profile>?) : SocialNetwork {

    init {
        if (profiles == null) {
            profiles = arrayListOf()
        }
    }

    override fun getFriendsIterator(profileEmail: String): ProfileIterator {
        return LinkedInIterator(this, type = "friends", email = profileEmail)
    }

    override fun getCoworkersIterator(profileEmail: String): ProfileIterator {
        return LinkedInIterator(this, type = "coworkers", email = profileEmail)
    }

    fun requestProfileFriendsFromLinkedIn(profileEmail: String, contactType: String): List<String> {
        simulateNetworkLatency()

        print("\nLinkedIn: Loading '$contactType' list of '$profileEmail' over the network...\n")

        val profile = findProfile(profileEmail)
        if (profile != null) {
            return profile.getContacts(contactType)
        }

        return emptyList()
    }

    fun requestProfileFromLinkedIn(profileEmail: String): Profile? {
        simulateNetworkLatency()

        print("\nLinkedIn: Loading profile '$profileEmail' over the network...\n")

        return findProfile(profileEmail)
    }

    private fun findProfile(profileEmail: String): Profile? {
        profiles?.forEach { profile ->
            run {
                if (profile.email.equals(profileEmail)) {
                    return profile
                }
            }
        }
        return null
    }

    private fun simulateNetworkLatency() {
        try {
            Thread.sleep(2000)
        } catch (ex: InterruptedException) {
            ex.printStackTrace()
        }
    }
}

class LinkedInIterator(val linkedIn: LinkedIn, val type: String, val email: String) : ProfileIterator {

    private var currentLocation: Int = 0
    val emails = ArrayList<String>()
    val profiles = ArrayList<Profile?>()

    override fun hasNext(): Boolean {
        lazyLoad()
        return currentLocation < emails.size
    }

    override fun getNext(): Profile? {
        if (!hasNext()) {
            return null
        }

        val friendEmail: String = emails[currentLocation]
        var friendProfile: Profile? = this.profiles[currentLocation]

        if (friendProfile == null) {
            friendProfile = linkedIn.requestProfileFromLinkedIn(friendEmail)
            profiles[currentLocation] = friendProfile
        }
        currentLocation++
        return friendProfile
    }

    override fun reset() {
        currentLocation = 0
    }

    private fun lazyLoad() {
        if (emails.size == 0) {
            val profiles: List<String> = linkedIn.requestProfileFriendsFromLinkedIn(email, type)
            for (profile in profiles) {
                emails.add(profile)
                this.profiles.add(null)
            }
        }
    }
}
