package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 配置这个servlet在服务器启动时调用
 * @author hc
 *
 */
public class MyInitServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("MyServlet的init方法被调用");
		//完成一些初始化任务
		System.out.println("创建数据库,表,读取参数");
		//创建一个线程
		SendEmailThread sendEmailThread=new SendEmailThread();
		//启动线程
		sendEmailThread.start();
		
	}
	
	
	
}



