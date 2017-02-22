package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ½ûÓÃä¯ÀÀÆ÷»º´æ
 */
public class Servlet02 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * Cache-Control,pargma,expires
		 */
		response.setHeader("Cache-Control", "no-cache");
		response.setHeader("pragma", "no-cache");
		response.setDateHeader("expires", -1);
		response.getWriter().print("hello response!");
		
	}

}
