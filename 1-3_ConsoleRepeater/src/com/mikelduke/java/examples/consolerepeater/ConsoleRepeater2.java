package com.mikelduke.java.examples.consolerepeater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ConsoleRepeater reads from command line repeatedly until the word quit is 
 * entered
 * 
 * Similar to the previous ConsoleRepeater, but uses the try with resources style
 * 
 * @author Mikel
 *
 */
public class ConsoleRepeater2 {

	public static void main(String[] args) {
		System.out.println("Type something");

		String command = "";

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (!command.equals("quit")) {
				command = br.readLine();
				System.out.println("You entered: " + command);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Quit!");
	}
}
