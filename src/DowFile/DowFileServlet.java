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
 * @author hc
 *
 */
public class DowFileServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
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

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
