package facade;

import facade.shape.Shape;
import facade.shape.impl.Circle;
import facade.shape.impl.Rectangle;
import facade.shape.impl.Square;

public class ShapeFacade {
	private Shape[] shapes = {
			new Circle(),
			new Rectangle(),
			new Square()
	};

	public void drawCircle() {
		shapes[0].draw();
	}
	public void drawRectangle() {
		shapes[1].draw();
	}
	public void drawSquare() {
		shapes[2].draw();
	}
}
