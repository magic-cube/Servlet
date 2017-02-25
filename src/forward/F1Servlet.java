package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 请求转发至Servletf2
 * 请求转发与重定向的区别:
 * 1,请求转发是一次请求一次响应,重定向是两次请求,两次响应
 * 2,请求转发地址栏不变化,重定向显示后一个请求的地址
 * 3,请求转发只能转发至本项目的其他Servlet
 * 
 */
public class F1Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("OneServlet...");
		//设置响应头
		response.setHeader("aaa", "AAA");
		//此处应该是留头不留体,只能设置响应头,不能设置响应体
		response.getWriter().print("hello one.");
		
		/*
		 * 向request域中添加一个属性
		 */
		request.setAttribute("username", "hc");
		
		//请求转发,等同于调用Servletf2的service()方法
		request.getRequestDispatcher("/Servletf2").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
