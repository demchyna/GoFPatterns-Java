package facade.shape.impl;

import facade.shape.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw Square...");
	}
}
