package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servletf1会将请求转发至此Servlet,此servlet既可以设置响应头,也可以设置响应体
public class Servletf2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("tow Servlet");
		//设置响应体
		response.getWriter().print("hell tow...");
		
		//从request域中取属性
		System.out.println(request.getAttribute("username"));
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
