package flyweight;

import java.util.HashMap;
import flyweight.shape.Shape;
import flyweight.shape.impl.Circle;

public class ShapeFactory {
	private static final HashMap<String, Shape> circleCache = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleCache.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleCache.put(color, circle);
			System.out.println("\nCreating circle of color : " + color);
		}
		return circle;
	}
}


