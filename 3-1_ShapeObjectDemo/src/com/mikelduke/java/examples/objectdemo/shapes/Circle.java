package com.mikelduke.java.examples.objectdemo.shapes;

public class Circle extends Shape implements Nameable {

	private int radius;
	
	public Circle() { }
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public String getName() {
		return "Circle";
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
