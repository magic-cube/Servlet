package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet04 extends HttpServlet {

	/*
	 * 使用Referer请求头,防止盗链
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer=request.getHeader("Referer");
		System.out.println(referer);
		//只要不是本站发出的请求,可以组织其访问,让其跳转到百度或者发送404
		if(referer==null||!referer.contains("localhost")){
			//重定位至百度
			response.sendRedirect("http://www.baidu.com");
		}else{
			System.out.println("hello");
		}
	}

}
