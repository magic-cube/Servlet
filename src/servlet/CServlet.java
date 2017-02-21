package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CServlet extends BServlet {
	
	//此处不能覆盖父类的init方法,会导致父类的config没能被赋值
	//覆盖父类自己定义的init(),然后在父类实现的Servlet接口的init()中调用自己的init
	@Override
	/*
	 * 回调
	 */
	public void init() {
		//在此处可完成初始化,会被父类的init方法调用
		System.out.println();
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		String value=getInitParameter("p1");
	}
}
