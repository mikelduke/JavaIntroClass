package com.mikelduke.java.examples.arraydemo;

public class ArrayDemo {

	public static void main(String[] args) {
		intArrayDemo1();
		intArrayDemo2();
		
		stringArrayDemo();
		objectArrayDemo();
	}

	public static void intArrayDemo1() {
		int[] intAr = new int[5];
		
		//Native int type initalizes to all 0 
		for (int i = 0; i < intAr.length; i++) {
			System.out.println("intAr[" + i + "]: " + intAr[i]);
		}
		
		//Set a value
		for (int i = 0; i < intAr.length; i++) {
			intAr[i] = i;
		}
		
		System.out.println("Print it again");
		for (int i = 0; i < intAr.length; i++) {
			System.out.println("intAr[" + i + "]: " + intAr[i]);
		}
	}
	
	public static void intArrayDemo2() {
		int[] intAr2 = {5, 6, 7, 8, 9};
		
		for (int i = 0; i < intAr2.length; i++) {
			System.out.println("intAr2[" + i + "]: " + intAr2[i]);
		}
	}
	
	public static void stringArrayDemo() {
		String stringAr[] = { "string1", "another", "word", "stuff" };
		
		for (int i = 0; i < stringAr.length; i++) {
			System.out.println("stringAr[" + i + "]: " + stringAr[i]);
		}
	}
	
	public static void objectArrayDemo() {
		Object objAr[] = { "string1", "another", "word", "stuff", 1, 2, 3 };
		
		for (int i = 0; i < objAr.length; i++) {
			System.out.println("objAr[" + i + "]: " + objAr[i].toString() + "; " + objAr[i].getClass().getName());
		}
	}
}
