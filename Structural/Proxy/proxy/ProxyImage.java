package proxy;

import proxy.image.Image;
import proxy.image.impl.RealImage;

public class ProxyImage implements Image {
	private RealImage realImage;
	private String fileName;
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
			realImage.display();
		} else {
			System.out.println("Displaying " + fileName);
		}

	}
}
