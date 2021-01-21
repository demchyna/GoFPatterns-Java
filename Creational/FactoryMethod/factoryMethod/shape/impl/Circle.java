package factoryMethod.shape.impl;

import factoryMethod.shape.Shape;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw circle...");
	}
}
