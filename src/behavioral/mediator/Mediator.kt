package behavioral.mediator

/**
 * Created by framgia on 10/07/2017.
 */
object Mediator {
    @JvmStatic fun main(args: Array<String>) {
        val chatRoom = ChatRoom()

        val robert = User("Robert", chatRoom = chatRoom)
        val john = User("John", chatRoom = chatRoom)
        val marry = User("Marry", chatRoom = chatRoom)
        val henry = User("Henry", chatRoom = chatRoom)

        chatRoom.addUser(robert)
        chatRoom.addUser(john)
        chatRoom.addUser(marry)
        chatRoom.addUser(henry)

        robert.sendMessage("Hi! All")
        henry.sendMessage("Hi! Robert")
    }
}
