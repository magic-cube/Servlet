package servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * �鿴Servlet�еķ���
 */
public class AServlet implements Servlet {

	/*
	 * �������ڷ���(��TomCat������)
	 * ��Servlet������֮ǰ����,����ֻ�ᱻ����һ��(��������...)
	 */
	@Override
	public void destroy() {
		System.out.println("destory()....");
	}

	/*
	 * ������ȡservlet��������Ϣ
	 */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()....");
		return null;
	}

	/*
	 * ��ȡservlet����Ϣ
	 */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()....");
		return "����һ�����ֵ�servlet";
	}
	
	/*
	 * �������ڷ���(��TomCat������)
	 * ����Servlet���󴴽�֮������ִ��,��ִֻ��һ��(����֮��)
	 */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init()....");
		
		/*
		 * ��ȡ��ʼ������ 
		 */
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		
		/*
		 * ��ȡ���г�ʼ������������
		 */
		Enumeration e=servletConfig.getInitParameterNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
	
	/*
	 * �������ڷ���(��TomCat������)
	 * �ᱻ���ö��!!!
	 * ÿ�δ����������ڵ����������
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service()....");
	}

}
