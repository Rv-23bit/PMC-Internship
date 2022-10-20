package com.socket.palindrome;

import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) throws Exception {
		System.out.println("Client Started.");
		Socket soc = new Socket("localhost", 9999);
		System.out.println("Connected to the server.");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		String num = input.readLine();
		PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
		out.println(num);
		BufferedReader br = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		System.out.println("Message from Server:");
		System.out.println(br.readLine());
		soc.close();
	}

}
