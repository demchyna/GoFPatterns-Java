package shape.impl;

import color.Color;
import shape.Shape;

public class Square extends Shape {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.print("The square with the ");
        color.fill();
    }
}
