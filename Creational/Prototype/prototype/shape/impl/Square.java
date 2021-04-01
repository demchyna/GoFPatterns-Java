package prototype.shape.impl;

import prototype.shape.Shape;

public class Square extends Shape {
	private double side;

	public Square(String color) {
		super("square", color);
	}

	private Square(Square target) {
		super(target);
		this.side = target.side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Draw square...");
	}

	@Override
	public Object clone() {
		return new Square(this);
	}
}

