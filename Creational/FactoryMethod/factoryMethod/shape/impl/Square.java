package factoryMethod.shape.impl;

import factoryMethod.shape.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw square...");
	}
}
