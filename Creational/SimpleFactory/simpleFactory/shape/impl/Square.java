package simpleFactory.shape.impl;
import simpleFactory.shape.Shape;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Draw square...");
	}
}
