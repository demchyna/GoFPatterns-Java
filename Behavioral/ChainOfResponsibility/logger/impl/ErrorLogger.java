package logger.impl;

import logger.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger() {
		this.level = AbstractLogger.ERROR;
	}

	@Override
	protected void write(String message) {
		System.out.println("Error: " + message);
	}
}
