package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/Servlet1")

public class Servlet1 extends HttpServlet {

	private String output;

//	init()
	// Initializing servlet
	public void init() throws ServletException {
		output = "This is from init() method";
	}

//	service()
	// Requesting and printing the output
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println(output);
	}

//	destroy()
	public void destroy() {
		System.out.println("Over");
	}
}
