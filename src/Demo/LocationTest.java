package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * �ض���
 * 1.����Location
 * 2.����302״̬��
 */
public class LocationTest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Locaion");
		
		//����location
		response.setHeader("Location", "/Servlet/Servlet01");
		response.setStatus(302);
	}

}
