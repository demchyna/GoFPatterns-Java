package abstractState.impl;

import abstractState.Context;
import abstractState.State;

public class StartState implements State {
	public void doAction(Context context) {
		context.setState(this);
	}
	public String toString() {
		return "Player is in start state";
	}
}

