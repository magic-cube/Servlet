package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 模拟GenericServlet
 */
public class BServlet implements Servlet {

	private ServletConfig config;
	
	/*
	 * 需要就写,不需要就不写
	 */
	@Override
	public void destroy() {
		System.out.println("啊!我要死了!");
	}
	
	
	/*
	 * 请放心,这个方法一定会在init()方法之后被调用
	 * init()被调用后,本类的成员this.config已经有值了 
	 */
	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}
	
	/*
	 * 没有用的东西,爱实现不实现
	 */
	@Override
	public String getServletInfo() {
		return "我是一个快乐的Servlet";
	}

	/*
	 * 由Tomcat来调用,并且只调用一次
	 * 是这些方法中第一个被调用的,它会在构造器之后马上被调用 
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		//把Tomcat传递的Servletconfig赋值给本类的一个成员,将其保存起来,方便在其他方法中调用
		this.config=config;
		init();
	}
	
	/*
	 * 空的方法
	 * 这个方法是本类自己定义的!不是Servlet接口中的方法
	 */
	public void init(){
		
	}
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		/*
		 * 可以在这里使用ServletConfig成员
		 */
		System.out.println("每次处理请求都会被调用");
	}
	
	public ServletContext getServletContext(){
		return this.config.getServletContext();
	}
	
	/*
	 *  通过名称,获取指定初始化参数的值
	 *  为ServletConfig的方法
	 */
	public String getInitParameter(String name){
		return this.config.getInitParameter(name);
	}
}
