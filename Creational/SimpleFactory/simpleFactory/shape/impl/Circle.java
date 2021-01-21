package simpleFactory.shape.impl;
import simpleFactory.shape.Shape;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw circle...");
	}
}
