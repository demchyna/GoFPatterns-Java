package prototype;
import java.util.Hashtable;

import prototype.shape.Shape;
import prototype.shape.impl.*;

public class ShapeCache {
	private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

	public static Shape getShape(String type) {
		Shape cachedShape = shapeMap.get(type);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
		Circle circle = new Circle("Green");
		circle.setRadius(6.85);
		shapeMap.put(circle.getType(), circle);

		Square square = new Square("Blue");
		square.setSide(7.15);
		shapeMap.put(square.getType(), square);
	}
}
