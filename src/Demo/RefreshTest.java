package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 定时刷新
 * 设置Refresh头,定时刷新
 */
public class RefreshTest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 发送响应体!,使用流
		 */
		PrintWriter writer=response.getWriter();
		//会出现乱码
		writer.print("欢迎xxx登录,5秒钟后悔自动跳转到主页");
		//设置名为Refresh的响应头
		response.setHeader("Refresh", "5;URL=/Servlet/Servlet01");
		
	}

}
