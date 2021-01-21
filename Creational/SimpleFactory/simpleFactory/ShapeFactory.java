package simpleFactory;

import simpleFactory.shape.Shape;
import simpleFactory.shape.impl.Circle;
import simpleFactory.shape.impl.Rectangle;
import simpleFactory.shape.impl.Square;

public class ShapeFactory {
	public Shape createShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
