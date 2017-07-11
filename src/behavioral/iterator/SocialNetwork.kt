package behavioral.iterator

/**
 * Created by framgia on 10/07/2017.
 */
interface SocialNetwork {
    fun getFriendsIterator(profileEmail: String): ProfileIterator
    fun getCoworkersIterator(profileEmail: String): ProfileIterator
}
