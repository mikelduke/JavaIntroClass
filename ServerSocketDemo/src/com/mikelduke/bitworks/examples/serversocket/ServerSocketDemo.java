package com.mikelduke.bitworks.examples.serversocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
	
	public static void main(String[] args) {
		int portNumber = 81;

		System.out.println("Waiting for Connection on port " + portNumber);
		try ( 
			ServerSocket serverSocket = new ServerSocket(portNumber);
			Socket clientSocket = serverSocket.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
		) {
			String inputLine = "";
			
			while ((inputLine = in.readLine()) != null && in.ready()) {
				System.out.println("Read: " + inputLine);
			}
			System.out.println("Finished Reading");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
