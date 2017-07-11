package behavioral.iterator

/**
 * Created by framgia on 10/07/2017.
 */
class Profile(var email: String, var name: String, vararg contacts: String) {

    val contacts = HashMap<String, List<String>>()

    init {
        for (contact in contacts) {
            val parts = contact.split(":")
            var contactType = "friend"
            val contactEmail: String
            if (parts.size == 1) {
                contactEmail = parts[0]
            } else {
                contactType = parts[0]
                contactEmail = parts[1]
            }
            if (!this.contacts.contains(contactType)) {
                this.contacts.put(contactType, arrayListOf())
            }
            (this.contacts[contactType] as ArrayList<String>).add(contactEmail)
        }
    }

    fun getContacts(contactType: String): List<String> {
        if (!contacts.containsKey(contactType)) {
            contacts.put(contactType, arrayListOf())
        }
        return contacts[contactType] as List<String>
    }
}