import abstractStrategy.Context;
import abstractStrategy.impl.*;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context((a, b) -> a - b);
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context((a, b) -> a * b);
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}

