package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("pwd");
		if(email.equals("admin@pmc.com") && pass.equals("pmc123")) {
			HttpSession session = request.getSession();
			session.setAttribute("name", name);
			session.setAttribute("email", email);
			session.setAttribute("pass", pass);
			RequestDispatcher rd = request.getRequestDispatcher("Index");
			rd.forward(request, response);
		}
		else {
			response.sendRedirect("error.html");
		}
	}

}
