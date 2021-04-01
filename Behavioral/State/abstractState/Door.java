package abstractState;

public class Door {
	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}
}

