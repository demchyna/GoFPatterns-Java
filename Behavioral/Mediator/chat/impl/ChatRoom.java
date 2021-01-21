package chat.impl;

import chat.Mediator;
import chat.User;

import java.util.Date;

public class ChatRoom implements Mediator {

	@Override
	public void notify(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}

