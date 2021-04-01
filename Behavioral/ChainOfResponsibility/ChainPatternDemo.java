import logger.AbstractLogger;
import logger.impl.*;

public class ChainPatternDemo {

	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();

		loggerChain.logMessage(AbstractLogger.INFO, "This is a info message.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug message.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error message.");
	}

	private static AbstractLogger getChainOfLoggers() {

		AbstractLogger infoLogger = new InfoLogger();
		AbstractLogger debugLogger = new DebugLogger();
		AbstractLogger errorLogger = new ErrorLogger();

		infoLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(errorLogger);

		return infoLogger;
	}
}
