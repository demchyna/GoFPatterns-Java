import logger.AbstractLogger;
import logger.impl.*;

public class ChainPatternDemo {
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new DebugLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new InfoLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is a diagnostic information.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug information.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
}

