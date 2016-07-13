package com.mikelduke.bitworks.examples.serversocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketWritingDemo {
	
	public static void main(String[] args) {
		int portNumber = 81;

		System.out.println("Waiting for Connection on port " + portNumber);
		try ( 
			ServerSocket serverSocket = new ServerSocket(portNumber);
			Socket clientSocket = serverSocket.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
		) {
			String inputLine = in.readLine();
			System.out.println("Read: " + inputLine);
			
			String outputLine = "Hello from the server";
			System.out.println("Sending output " + outputLine);
			out.println(outputLine);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
}
