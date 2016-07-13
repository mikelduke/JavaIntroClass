package com.mikelduke.java.examples.objectdemo.shapes;

public class Rectangle extends Shape {
	
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String getName() {
		return "Rectangle";
	}

	@Override
	public String toString() {
		return this.getName() + 
				" length: " + getLength() + 
				" width: " + getWidth() + 
				" Area: " + getArea();
	}
}
