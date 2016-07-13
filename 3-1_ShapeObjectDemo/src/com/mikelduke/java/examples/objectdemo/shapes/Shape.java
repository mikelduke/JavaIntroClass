package com.mikelduke.java.examples.objectdemo.shapes;

public abstract class Shape implements Nameable {
	public abstract double getArea();
	
	@Override
	public String getName() {
		return "unknown shape";
	}
}
