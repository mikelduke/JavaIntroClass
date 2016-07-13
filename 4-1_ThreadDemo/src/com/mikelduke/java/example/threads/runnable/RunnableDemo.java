package com.mikelduke.java.example.threads.runnable;

public class RunnableDemo {

	public static void main(String[] args) {
		System.out.println("Runnable Demo Started");
		
		Thread t = new Thread(new SimpleRunnable());
		t.start();
		
		System.out.println("This line is After starting Runnable");
	}

}
