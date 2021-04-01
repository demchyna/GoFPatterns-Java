package chat.impl;

import chat.Mediator;
import chat.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class ChatRoom implements Mediator {

	@Override
	public void notify(User user, String message) {
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))
				+ " [" + user.getName() + "] : " + message);
	}
}
