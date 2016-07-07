package com.mikelduke.java.examples.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("value 1");
		list.add("value 2");
		
		String str1 = "string 1";
		list.add(str1);
		
		System.out.println("List: " + list + " size: " + list.size());
		
		list.remove(1);
		
		System.out.println("List: " + list);
		
		
		list.add("test");
		System.out.println("Added test to List: " + list);
		list.remove("test");
		System.out.println("Removed Test from List: " + list);
		
		list.clear();
		System.out.println("Cleared List: " + list);
	}
}
