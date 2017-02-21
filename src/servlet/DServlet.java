package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DServlet extends GenericServlet {

	/*
	 * 如果想完成一些初始化工作,可以覆盖无参的init方法
	 */
	@Override
	public void init() throws ServletException {
		System.out.println("哈哈哈");
	}
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("hello");
	}

	/*
	 * 如果想留遗言...覆盖distroy方法 
	 */
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
}
