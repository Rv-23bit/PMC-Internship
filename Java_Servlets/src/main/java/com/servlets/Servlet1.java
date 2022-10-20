package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1() {
		super();
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String dept = req.getParameter("dept");
		PrintWriter out = res.getWriter();
		out.println("Welcome! @"+name+" ,Your details are as follows: ");
		out.println("<br> Full Name: "+name);
		out.println("<br> Age: "+age);
		out.println("<br> Department: "+dept);
//		res.getWriter().append("Served at: ").append(req.getContextPath());
	}

}
