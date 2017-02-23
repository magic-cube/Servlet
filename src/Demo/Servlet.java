package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 获取客户端ip,获取请求方法,获取User-Agent,
 * 得到客户端的信息(操作系统,浏览器)
 */
public class Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		//获取ip地址
		String addr=request.getRemoteAddr();
		System.out.println("IP:"+addr);
		//获取请求方式
		System.out.println("请求方式:"+request.getMethod());
		
		String userAgent=request.getHeader("User-Agent");
		
		if(userAgent.toLowerCase().contains("chrome")){
			System.out.println("你用的是谷歌浏览器");
		}else if(userAgent.toLowerCase().contains("msie")){
			System.out.println("你用的是ie");
		}
		
		System.out.println(userAgent);
	}

}


