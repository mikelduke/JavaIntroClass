package com.mikelduke.java.examples.consolerepeater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ConsoleRepeater reads from command line repeatedly until the word quit is 
 * entered
 * 
 * @author Mikel
 *
 */
public class ConsoleRepeater {

	public static void main(String[] args) {
		System.out.println("Type something");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String command = "";

		try {
			while (!command.equals("quit")) {
				command = br.readLine();
				System.out.print("You entered: " + command);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Quit!");
	}
}
