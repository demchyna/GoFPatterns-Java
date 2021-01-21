import abstractState.Context;
import abstractState.impl.StartState;
import abstractState.impl.StopState;
import abstractState.State;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		
		State startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState());

		State stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState());
	}
}

