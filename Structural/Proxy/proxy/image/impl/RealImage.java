package proxy.image.impl;

import proxy.image.Image;

public class RealImage implements Image {
	private String fileName;
	public RealImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		loadFromDisk(fileName);
		System.out.println("Displaying " + fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + fileName);
	}
}
