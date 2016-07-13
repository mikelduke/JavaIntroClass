package com.mikelduke.java.examples.objectdemo;

import com.mikelduke.java.examples.objectdemo.shapes.Circle;
import com.mikelduke.java.examples.objectdemo.shapes.Nameable;
import com.mikelduke.java.examples.objectdemo.shapes.Rectangle;
import com.mikelduke.java.examples.objectdemo.shapes.Shape;
import com.mikelduke.java.examples.objectdemo.shapes.Square;

/**
 * A basic project to demonstrate Object inheritance using shapes.
 * 
 * A shape implements nameable and will have a default name of "unknown shape" 
 * and an abstract getArea method for subclasses to implement
 * 
 * Circle and Rectangle both extend from Shape and are subclasses, these would 
 * inherit the name of "unknown shape", but they Override the method to use their 
 * own name. These subclasses are required to have a getArea method.
 * 
 * A Square is a subclass of Rectangle, and so it inherits all of its 
 * functionality. It can even be called a Rectable or Shape.
 * 
 * @author Mikel
 *
 */
public class ShapeObjectDemo {

	public static void main(String[] args) {
		//Circle
		Circle c = new Circle();
		c.setRadius(2);
		System.out.println("A " + c.getName() + " with radius " + c.getRadius() + " has area " + c.getArea());
		
		/* Shape is an abstract superclass of Circle
		 * 
		 * getRadius is not available since Shape does not have that method, 
		 * but getName and getArea still work
		 */
		Shape c2 = new Circle(3);
		System.out.println("c2 " + c2.getName() + " with area " + c2.getArea());
		System.out.println("\tc2 toString: " + c2.toString());
		
		//Rectangle
		Rectangle r = new Rectangle(2,  5);
		System.out.println("r " + r.getName() + " has a area of " + r.getArea());
		System.out.println("r toString: " + r);
		
		/* Nameable is still really a rectangle, but it can refer to all 
		 * objects that implement Nameable
		 */
		Nameable nameable = r;
		System.out.println("r as nameable: \n\tgetName: " + nameable.getName() + "\n\ttoString: " + nameable);
		nameable = c;
		System.out.println("c as nameable: \n\tgetName: " + nameable.getName() + "\n\ttoString: " + nameable);
		
		//Square, which inherits from Rectangle with a different name and constructor
		Square s = new Square(5);
		System.out.println("s " + s.getName() + " has length " + s.getLength() + " and a area of " + s.getArea());
		System.out.println("s.toString: " + s); //this is also inherited from Rectangle
		
		Shape shape = new Square(2);
		System.out.println("A " + shape.getName() + " is still a shape");
		
		//This does not work since the class is abstract, the compiler throws errors
		//Shape shape2 = new Shape();
		
		//This will not work either
		//Square squareShape = new Shape();
		
		//A rectangle is not a square, so this does work
		//Square squareRect = new Rectangle(2, 3);
		
		//This DOES work, since a Square is a rectangle
		Rectangle rectangleSq = new Square(4);
		System.out.println("rectangleSq: " + rectangleSq);
	}
}
