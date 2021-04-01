package logger.impl;

import logger.AbstractLogger;

public class InfoLogger extends AbstractLogger {

	public InfoLogger() {
		this.level = AbstractLogger.INFO;
	}

	@Override
	protected void write(String message) {
		System.out.println("Info: " + message);
	}
}
