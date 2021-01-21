package game.impl;

import game.Game;

public class Chess extends Game {
	@Override
	public void initialize() {
		System.out.println("Chess Game Initialized!");
	}
	@Override
	public void startPlay() {
		System.out.println("Chess Game Started. Enjoy the game!");
	}
	@Override
	public void endPlay() {
		System.out.println("Chess Game Finished!");
	}
}

