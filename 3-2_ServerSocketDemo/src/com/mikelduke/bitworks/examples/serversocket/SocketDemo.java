package com.mikelduke.bitworks.examples.serversocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {

	public static void main(String[] args) {
		int port = 81;
		String host = "localhost";
		
		System.out.println("Attempting to connect to " + host + ":" + port);
		try (
			Socket socket = new Socket(host, port);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		) {
			String outputLine = "Hello I am socket client!";
			System.out.println("Sending output " + outputLine);
			out.println(outputLine);
			
			String inputLine = in.readLine();
			System.out.println("Read: " + inputLine);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
}
