import proxy.image.Image;
import proxy.ProxyImage;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("picture.jpg");
		image.display();

		System.out.println();

		image.display();
	}
}
