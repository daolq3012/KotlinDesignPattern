package behavioral.mediator

import java.util.*

/**
 * Created by framgia on 10/07/2017.
 */
class ChatRoom {
    val users = arrayListOf<User>()

    fun sendMessage(user: User, message: String) {
        print("${Date()} [${user.name}]: Sending $message\n")
        users
                .filter { user != it }
                .forEach { receiveMessage(it, message) }
    }

    private fun receiveMessage(user: User, message: String) {
        print("[${user.name}]: Received $message\n")
    }

    fun addUser(user: User) {
        users.add(user)
    }
}
