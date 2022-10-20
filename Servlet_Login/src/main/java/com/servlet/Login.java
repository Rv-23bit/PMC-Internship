package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");
//		PrintWriter out = res.getWriter();
		
		if (email.equals("admin@pmc.com") && pass.equals("pmc123")) {
			RequestDispatcher rd = req.getRequestDispatcher("Success");
			rd.forward(req, res);
		}
		else {
			res.sendRedirect("error.html");
		}
	}

}
