package behavioral.mediator

/**
 * Created by framgia on 10/07/2017.
 */
class User(var name: String, var chatRoom: ChatRoom) {
    fun sendMessage(message: String) {
        chatRoom.sendMessage(this, message)
    }
}
