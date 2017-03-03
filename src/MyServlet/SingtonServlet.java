package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet是单例的
 * 一个类型的Servlet只有一个实例对象,那么就有可能出现一个servlet同时处理多个请求的情况
 * servlet不是线程安全的,因而效率高,不应该在servlet中创建成员变量
 * 
 * 默认情况下,服务器会在某个Servlet第一次收到请求时创建它,之后常驻内存
 * 
 * @author hc
 *
 */
public class SingtonServlet extends HttpServlet {

	/*
	 * 此处为了验证servlet是单例的,创建了成员变量
	 * 
	 */
	int i;
	
	
	/*
	 * 不管是get请求还是post请求,均使i++,这也是常用的将两种请求同时处理的方法
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		i++;
		System.out.println(i);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
