import factoryMethod.factory.ShapeFactory;
import factoryMethod.factory.impl.CircleFactory;
import factoryMethod.factory.impl.SquareFactory;
import factoryMethod.shape.Shape;

public class FactoryMethodPatternDemo {
    public static void main(String[] args) {

        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.createShape();
        square.draw();

    }
}
