package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 通过request获取url的相关方法
 */
public class Servlet05 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print(request.getScheme()+"<br/>");//获取请求协议
		pw.print(request.getServerName()+"<br/>");//获取服务器名称
		pw.print(request.getServerPort()+"<br/>");//获取服务器端口号
		pw.print(request.getContextPath()+"<br>");//获取项目名称
		pw.print(request.getServletPath()+"<br/>");//获取Servlet路径
		pw.print(request.getQueryString()+"<br/>");//获取参数部分
		pw.print(request.getRequestURI());//获取请求URl
		pw.print(request.getRequestURL());//获取请求URL
		
	}

}
