package com.mikelduke.java.example.threads;

public class SimpleThread extends Thread {

	@Override
	public void run() {
		System.out.println("Starting Thread to wait for 10 seconds");
		waitFor(3);
		System.out.println("End of Thread");
	}
	
	private void waitFor(int seconds) {
		for (int i = 0; i < seconds; i++) {
			try {
				Thread.sleep(1 * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Waited " + (i + 1) + " seconds");
		}
	}
}
