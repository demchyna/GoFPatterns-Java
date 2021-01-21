import color.impl.Blue;
import color.impl.Green;
import color.impl.Red;
import shape.impl.Circle;
import shape.Shape;
import shape.impl.Square;

public class BridgePatternDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(6.35, new Red());
		redCircle.draw();
		Shape greenCircle = new Circle(6.35,  new Green());
		greenCircle.draw();
		Shape blueCircle = new Circle(6.35,  new Blue());
		blueCircle.draw();

		Shape redSquare = new Square(6.35, new Red());
		redSquare.draw();
		Shape greenSquare = new Square(6.35,  new Green());
		greenSquare.draw();
		Shape blueSquare = new Square(6.35,  new Blue());
		blueSquare.draw();
	}
}


