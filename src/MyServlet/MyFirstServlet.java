package MyServlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 实现Servlet接口的方式开发servlet
 */
public class MyFirstServlet implements Servlet{

	/*
	 * 该函数用于初始化servlet,就是把servlet装载到内存中
	 * 该函数只会被调用一次
	 */
	public void init(ServletConfig config) throws ServletException{
		
	}
	
	/*
	 * 得到servletConfig对象
	 */
	public ServletConfig getServletConfig(){
		return null;
	}
	
	/*
	 * 该函数是服务函数,此处写业务逻辑代码,该函数每次都会被调用
	 */
	public void service(ServletRequest request,ServletResponse response)
		throws ServletException,java.io.IOException{
		
	}
	
	
	/*
	 * 得到servlet的配置信息
	 */
	public java.lang.String getServletInfo(){
		return null;
	}
	
	/*
	 * 销毁该servlet,从内存中清楚,该函数被调用一次
	 */
	public void destroy(){
		
	}
}




