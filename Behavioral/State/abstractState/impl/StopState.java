package abstractState.impl;

import abstractState.Context;
import abstractState.State;

public class StopState implements State {
	public void doAction(Context context) {
		context.setState(this);
	}
	public String toString() {
		return "Player is in stop state";
	}
}

