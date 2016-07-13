package com.mikelduke.java.examples.helloworldhttpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

/**
 * A super simple web server that will respond with Hello World and a connection 
 * number for each attempt.
 * 
 * Prints the incoming data to the system.out and sends a hard coded http 
 * response.
 * 
 * @author Mikel
 *
 */
public class HelloWorldHttpServer {

	private final int port;
	
	public static void main(String[] args) {
		int port = 80;
		
		//Use port 80 by default, but if an argument is specified use that
		if (args != null && args.length == 1) {
			port = Integer.valueOf(args[0].trim());
		}

		HelloWorldHttpServer server = new HelloWorldHttpServer(port);
		try { //Attempt to start the server which will run in a continuous loop
			server.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public HelloWorldHttpServer(int port) {
		this.port = port;
	}

	public void start() throws IOException {
		System.out.println("SimpleHttpServer Started on Port " + port);
		
		//We suppress this warning since the serverSocket is never closed because we are running in an endless loop
		@SuppressWarnings("resource")
		ServerSocket serverSocket = new ServerSocket(port);
		
		//This will be incremented and used on every connection
		int connectionCount = 0;
		
		while (true) {
			Socket clientSocket = serverSocket.accept(); //This will block until a connection attempt is made
			
			//Set up the input and output streams from the Socket
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			//print a message to say we have an incoming connection
			System.out.println("*******************************************************************************");
			System.out.println("Incoming Connection #" + ++connectionCount + " " //Increment then display connection counter
					+ Calendar.getInstance().getTime().toString()                //Display current time
					+ " From " + clientSocket.getRemoteSocketAddress().toString()); //And remote ip address
	
			//Read input into string builder until empty
			int inVal = 0;
			StringBuilder sb = new StringBuilder();
			
			/* Since we are building inside of a loop, a string builder is used. It 
			 * is better optimized in this case than simple concatenation due to the 
			 * allocation of less objects
			 */
			while ((inVal = in.read()) > -1 && in.ready()) {
				sb.append((char) inVal);
			}
			
			//Print the incoming data
			System.out.println("*******************************************************************************");
			System.out.println(sb.toString());
			System.out.println("*******************************************************************************");
			
			/* Write out hello world output message. This message is a preformatted 
			 * and simplistic http response, but it is valid. An easy improvement could
			 * be to send a file instead
			 */
			String response = 
					"HTTP/1.1 200 OK\r\n\r\n" +
					"HelloWorld!\r\n" +
					"You are visitor #" + connectionCount;
			System.out.println("Sending Response");
			out.println(response);
			
			/* Even though we created the PrintWriter with autoFlush = true on line 60
			 * we must call the flush() method to ensure that the data is sent. 
			 * 
			 * According to the javadoc: println, printf, or format will automatically
			 * call the flush method, but we did not call that here since it would 
			 * add an extra new line
			 */
			out.flush();
			
			//Close all of the resources
			out.close();
			in.close();
			clientSocket.close();
			
			System.out.println("Connection closed");
		}
	}
}
