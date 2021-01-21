import simpleFactory.ShapeFactory;
import simpleFactory.shape.Shape;

public class SimpleFactoryPatternDemo {
	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.createShape("CIRCLE");
		circle.draw();

		Shape rectangle = shapeFactory.createShape("RECTANGLE");
		rectangle.draw();

		Shape square = shapeFactory.createShape("SQUARE");
		square.draw();
	}
}
