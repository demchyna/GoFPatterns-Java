package factoryMethod.factory.impl;

import factoryMethod.factory.ShapeFactory;
import factoryMethod.shape.Shape;
import factoryMethod.shape.impl.Square;

public class SquareFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Square();
    }
}
