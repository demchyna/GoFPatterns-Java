package prototype.shape.impl;

import prototype.shape.Shape;

public class Circle extends Shape {
	private double radius;

	public Circle(String color) {
		super("circle", color);
	}

	private Circle(Circle target) {
		super(target);
		this.radius = target.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Draw circle...");
	}

	@Override
	public Object clone() {
		return new Circle(this);
	}
}

