package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DServlet extends GenericServlet {

	/*
	 * ��������һЩ��ʼ������,���Ը����޲ε�init����
	 */
	@Override
	public void init() throws ServletException {
		System.out.println("������");
	}
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("hello");
	}

	/*
	 * �����������...����distroy���� 
	 */
	@Override
	public void destroy() {
		System.out.println("destroy()");
	}
}
