package logger.impl;

import logger.AbstractLogger;

public class DebugLogger extends AbstractLogger {

	public DebugLogger() {
		this.level = AbstractLogger.DEBUG;
	}

	@Override
	protected void write(String message) {
		System.out.println("Debug: " + message);
	}
}
