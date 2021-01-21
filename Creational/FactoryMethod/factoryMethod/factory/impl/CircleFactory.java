package factoryMethod.factory.impl;

import factoryMethod.factory.ShapeFactory;
import factoryMethod.shape.Shape;
import factoryMethod.shape.impl.Circle;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
