package facade.shape.impl;

import facade.shape.Shape;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw circle...");
	}
}
