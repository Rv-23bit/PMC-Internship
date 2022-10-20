package com.socket.palindrome;

import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws Exception {
		System.out.println("Server has started.");
		ServerSocket ss = new ServerSocket(9999);
		Socket soc = ss.accept();
		System.out.println("Client connected.");
		BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		String n = input.readLine();
		int num = Integer.parseInt(n);
		int r, temp, sum = 0;

		temp = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			String msg = "It's a palindrome.";
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(msg);

		} else if (temp != sum) {
			String msg = "Not a palindrome.";
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(msg);
		}
		ss.close();
		soc.close();
	}

}
