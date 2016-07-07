package com.mikelduke.java.examples.loops;

public class LoopDemo {

	public static void main(String[] args) {
		forLoopDemo();
		whileDemo();
		doWhileDemo();
	}

	public static void forLoopDemo() {
		System.out.println("For Loop Demo");
		for (int i = 0; i < 4; i++) {
			System.out.println("For Loop Index: " + i);
		}
		
		for (int i = 4; i > 0; i--) {
			System.out.println("For Loop 2 Index: " + i);
		}
		
		for (int i = 10; i < 100; i += 25) {
			System.out.println("For Loop 3 Index: " + i);
		}
	}
	
	public static void whileDemo() {
		System.out.println("While Loop Demo");
		
		int i = 0;
		while (i < 4) {
			System.out.println("While Loop 1 Index: " + i);
			
			i++;
		}
		
		boolean loop = true;
		while (loop) {
			System.out.println("While Loop 2");
			
			loop = false;
		}
	}
	
	public static void doWhileDemo() {
		System.out.println("Do While Loop");
		
		int i = 0;
		do {
			System.out.println("While Loop 3 Index: " + i++);
		} while (i < 5);
	}
}
