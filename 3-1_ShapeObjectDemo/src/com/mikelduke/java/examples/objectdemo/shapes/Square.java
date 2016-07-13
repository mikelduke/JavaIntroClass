package com.mikelduke.java.examples.objectdemo.shapes;

public class Square extends Rectangle {

	public Square(int size) {
		super(size, size);
	}
	
	@Override
	public String getName() {
		return "Square";
	}
}
