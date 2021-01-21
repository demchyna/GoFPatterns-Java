package facade;

import facade.shape.impl.Circle;
import facade.shape.impl.Rectangle;
import facade.shape.impl.Square;

public class ShapeFacade {
	public void drawCircle() {
		new Circle().draw();
	}
	public void drawRectangle() {
		new Rectangle().draw();
	}
	public void drawSquare() {
		new Square().draw();
	}
}
