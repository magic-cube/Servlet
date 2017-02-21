package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * ģ��GenericServlet
 */
public class BServlet implements Servlet {

	private ServletConfig config;
	
	/*
	 * ��Ҫ��д,����Ҫ�Ͳ�д
	 */
	@Override
	public void destroy() {
		System.out.println("��!��Ҫ����!");
	}
	
	
	/*
	 * �����,�������һ������init()����֮�󱻵���
	 * init()�����ú�,����ĳ�Աthis.config�Ѿ���ֵ�� 
	 */
	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}
	
	/*
	 * û���õĶ���,��ʵ�ֲ�ʵ��
	 */
	@Override
	public String getServletInfo() {
		return "����һ�����ֵ�Servlet";
	}

	/*
	 * ��Tomcat������,����ֻ����һ��
	 * ����Щ�����е�һ�������õ�,�����ڹ�����֮�����ϱ����� 
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		//��Tomcat���ݵ�Servletconfig��ֵ�������һ����Ա,���䱣������,���������������е���
		this.config=config;
		init();
	}
	
	/*
	 * �յķ���
	 * ��������Ǳ����Լ������!����Servlet�ӿ��еķ���
	 */
	public void init(){
		
	}
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		/*
		 * ����������ʹ��ServletConfig��Ա
		 */
		System.out.println("ÿ�δ������󶼻ᱻ����");
	}
	
	public ServletContext getServletContext(){
		return this.config.getServletContext();
	}
	
	/*
	 *  ͨ������,��ȡָ����ʼ��������ֵ
	 *  ΪServletConfig�ķ���
	 */
	public String getInitParameter(String name){
		return this.config.getInitParameter(name);
	}
}
