package com.mikelduke.java.examples.consolereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Reads a single line from the console window
 * 
 * @author Mikel
 *
 */
public class ConsoleReader {
	
	public static void main(String[] args) {
		System.out.println("Type something");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
