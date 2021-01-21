import prototype.ShapeCache;
import prototype.shape.impl.Circle;
import prototype.shape.impl.Square;

public class PrototypePatternDemo {
	public static void main(String[] args) {

		ShapeCache.loadCache();

		Circle clonedCircle = (Circle) ShapeCache.getShape("circle");
		clonedCircle.draw();
		System.out.println("\tcolor: " + clonedCircle.getColor());
		System.out.println("\tradius: " + clonedCircle.getRadius());

		Square clonedSquare = (Square) ShapeCache.getShape("square");
		clonedSquare.draw();
		System.out.println("\tcolor: " + clonedSquare.getColor());
		System.out.println("\tside: " + clonedSquare.getSide());

	}
}

