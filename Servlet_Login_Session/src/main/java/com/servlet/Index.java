package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		String email = (String) session.getAttribute("email");
		PrintWriter out = response.getWriter();
		
		out.print("<center><h1>Welcome!</h1></center>");
		out.print("<h2>Your name is: "+name+"</h2>");
		out.print("<h2>Your email is: "+email+"</h2>");
		out.print("<a href='Logout'>Logout</a>");
		
	}
}
