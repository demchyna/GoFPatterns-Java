package prototype.shape;
public abstract class Shape {
	protected String type;
	protected String color;

	public Shape(String type, String color) {
		this.type = type;
		this.color = color;
	}

	public Shape(Shape target) {
		this.type = target.type;
		this.color = target.color;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void draw();

	@Override
	public abstract Object clone();
}
