package module_4_5;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sub")

public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h2>Enter your numbers-</h2>");
		out.println("<a href='index.html'>Go To Index</a>");
		out.println("<br><form action='sub' method='GET'>");
		out.println("<br><input name='num1' placeholder='1st Number'>");
		out.println("<input name='num2' placeholder='2nd Number'>");
		out.println("<input type='submit' value='Subtract'>");
		out.println("</form>");
		String a = req.getParameter("num1");
		String b = req.getParameter("num2");
		if (a != null && b != null) {
			int n1 = Integer.parseInt(a);
			int n2 = Integer.parseInt(b);
			out.println("<br>1st Number: " + n1);
			out.println("<br>2nd Number: " + n2);
			out.println("<br> The Difference is: " + (n1 - n2));
		}
	}
}
