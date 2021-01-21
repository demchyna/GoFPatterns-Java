package chat;

public class User {
	private String name;
	private Mediator mediator;

	public User(String name) {
		this.name = name;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void sendMessage(String message) {
		mediator.notify(this, message);
	}
}

