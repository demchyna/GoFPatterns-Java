package shape.impl;

import color.Color;
import shape.Shape;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius, Color color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.print("The circle with the ");
		color.fill();
	}
}
