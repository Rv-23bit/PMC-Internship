package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		String web = getServletContext().getInitParameter("Website");
		
		String fname = req.getParameter("first_name");
		String lname = req.getParameter("last_name");
		String dept = req.getParameter("department");
		String email = req.getParameter("email");
		String phone = req.getParameter("contact_no");
		
		out.print("<html>");
		out.print("<head>");
		out.print("<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\"\r\n"
				+ "	integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "<link rel=\"stylesheet\"\r\n"
				+ "	href=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css\"\r\n"
				+ "	integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\"\r\n"
				+ "	crossorigin=\"anonymous\">\r\n"
				+ "\r\n"
				+ "<script\r\n"
				+ "	src=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js\"\r\n"
				+ "	integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\"\r\n"
				+ "	crossorigin=\"anonymous\"></script>");
		out.print("</head>");
		out.print("<body>");
		out.print("<div class=\"container\">\r\n"
				+ "		<form class=\"well form-horizontal\"\r\n"
				+ "			id=\"contact_form\" action=\"Update\">\r\n"
				+ "			<fieldset>\r\n"
				+ "\r\n"
				+ "				<legend>\r\n"
				+ "					<center>\r\n"
				+ "						<h2>\r\n"
					+ "							<b>Your Updated Details</b>\r\n"
				+ "						</h2>\r\n"
				+ "						<h3>\r\n"
				+ "							<b>"+web+"</b>\r\n"
				+ "						</h3>\r\n"
				+ "					</center>\r\n"
				+ "				</legend>\r\n"
				+ "				<br>\r\n"
				+ "");
		out.print("<div class=\"form-group\">\r\n"
				+ "					<label class=\"col-md-4 control-label\">First Name</label>\r\n"
				+ "					<div class=\"col-md-4 inputGroupContainer\">\r\n"
				+ "						<div class=\"input-group\">\r\n"
				+ "							<span class=\"input-group-addon\"><i\r\n"
				+ "								class=\"glyphicon glyphicon-user\"></i></span> <input name=\"first_name\"\r\n"
				+ "								value="+fname+" class=\"form-control\" type=\"text\" readonly>\r\n"
				+ "						</div>\r\n"
				+ "					</div>\r\n"
				+ "				</div>\r\n"
				+ "");
		out.print("<div class=\"form-group\">\r\n"
				+ "					<label class=\"col-md-4 control-label\">Last Name</label>\r\n"
				+ "					<div class=\"col-md-4 inputGroupContainer\">\r\n"
				+ "						<div class=\"input-group\">\r\n"
				+ "							<span class=\"input-group-addon\"><i\r\n"
				+ "								class=\"glyphicon glyphicon-user\"></i></span> <input name=\"last_name\"\r\n"
				+ "								value="+lname+" class=\"form-control\" type=\"text\" readonly>\r\n"
				+ "						</div>\r\n"
				+ "					</div>\r\n"
				+ "				</div>\r\n"
				+ "");
		out.print("<div class=\"form-group\">\r\n"
				+ "					<label class=\"col-md-4 control-label\">Department</label>\r\n"
				+ "					<div class=\"col-md-4 inputGroupContainer\">\r\n"
				+ "						<div class=\"input-group\">\r\n"
				+ "							<span class=\"input-group-addon\"><i\r\n"
				+ "								class=\"glyphicon glyphicon-user\"></i></span> <input name=\"department\"\r\n"
				+ "								value="+dept+" class=\"form-control\" type=\"text\" readonly>\r\n"
				+ "						</div>\r\n"
				+ "					</div>\r\n"
				+ "				</div>\r\n"
				+ "");	
		out.print("<div class=\"form-group\">\r\n"
				+ "					<label class=\"col-md-4 control-label\">E-Mail</label>\r\n"
				+ "					<div class=\"col-md-4 inputGroupContainer\">\r\n"
				+ "						<div class=\"input-group\">\r\n"
				+ "							<span class=\"input-group-addon\"><i\r\n"
				+ "								class=\"glyphicon glyphicon-envelope\"></i></span> <input name=\"email\"\r\n"
				+ "								value="+email+" class=\"form-control\" type=\"text\" readonly>\r\n"
				+ "						</div>\r\n"
				+ "					</div>\r\n"
				+ "				</div>");
		out.print("<div class=\"form-group\">\r\n"
				+ "					<label class=\"col-md-4 control-label\">Contact No.</label>\r\n"
				+ "					<div class=\"col-md-4 inputGroupContainer\">\r\n"
				+ "						<div class=\"input-group\">\r\n"
				+ "							<span class=\"input-group-addon\"><i\r\n"
				+ "								class=\"glyphicon glyphicon-earphone\"></i></span> <input\r\n"
				+ "								name=\"contact_no\" value="+phone+" class=\"form-control\"\r\n"
				+ "								type=\"text\" readonly>\r\n"
				+ "						</div>\r\n"
				+ "					</div>\r\n"
				+ "				</div>");
		out.print("<center><a href='Register.html'>Go To Register</a></center>");
		out.print("</body>");
		out.print("</html>");
	}
}
