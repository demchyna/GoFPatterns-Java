package simpleFactory.shape.impl;
import simpleFactory.shape.Shape;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw rectangle...");
	}
}
