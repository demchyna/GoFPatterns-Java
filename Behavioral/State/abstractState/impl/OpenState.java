package abstractState.impl;

import abstractState.Door;
import abstractState.State;

public class OpenState implements State {

	public void doAction(Door door) {
		door.setState(this);
	}

	public String toString() {
		return "Door is opened.";
	}
}
