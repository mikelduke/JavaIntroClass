package com.mikelduke.java.example.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Thread Demo Started");
		
		Thread t = new SimpleThread();
		t.start();
		
		System.out.println("This line is After starting Thread");
	}
}
