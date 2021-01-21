package facade.shape.impl;

import facade.shape.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw rectangle...");
	}
}
