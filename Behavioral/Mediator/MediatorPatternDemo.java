import chat.impl.ChatRoom;
import chat.Mediator;
import chat.User;

public class MediatorPatternDemo {
	public static void main(String[] args) {
		Mediator chatRoom = new ChatRoom();
		User user1 = new User("Mike");
		User user2 = new User("Nick");

		user1.setMediator(chatRoom);
		user2.setMediator(chatRoom);

		user1.sendMessage("Hello, Nick!");
		user2.sendMessage("Hello, Mike!");
	}
}

