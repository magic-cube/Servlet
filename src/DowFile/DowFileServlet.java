package DowFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 访问dowFile.html
 * 下载图片
 * 防盗链
 * @author hc
 *
 */
public class DowFileServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		//加入防盗链
		String referer=request.getHeader("Referer");
		if(referer==null||!referer.startsWith("http://localhost:8080/Servlet/demo")){
			
			//让他去百度或者跳回自己的下载页面
			response.getWriter().print("哥们,想盗链?去百度吧,亲!");
			response.setHeader("Refresh", "3;url=http://www.baidu.com");
			
			//response.sendRedirect("/Servlet/demo/dowFile.html");
		}else{
			String img=request.getParameter("filename");
			response.setHeader("Content-Disposition", "attachment;filename="+img);
			String path=this.getServletContext().getRealPath("/image/"+img);
			
			FileInputStream fis=new FileInputStream(path);
			int len=0;
			byte[] buffer=new byte[1024];
			while((len=fis.read(buffer))!=-1){
				response.getOutputStream().write(buffer, 0, len);
			}
			
			fis.close();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
