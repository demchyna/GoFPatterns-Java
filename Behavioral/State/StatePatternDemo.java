import abstractState.Door;
import abstractState.impl.OpenState;
import abstractState.impl.CloseState;
import abstractState.State;

public class StatePatternDemo {
	public static void main(String[] args) {
		Door door = new Door();
		
		State open = new OpenState();
		open.doAction(door);
		System.out.println(door.getState());

		State close = new CloseState();
		close.doAction(door);
		System.out.println(door.getState());
	}
}
