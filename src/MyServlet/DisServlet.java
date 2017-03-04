package MyServlet;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Content-Disposition
 * 告诉浏览器有文件需要下载
 * @author hc
 *
 */
public class DisServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		//演示下载文件
		response.setHeader("Content-Disposition", "attachment;filename=1.jpg");
		//1.获取到要下载文件的路径
		String path=this.getServletContext().getRealPath("/image/1.jpg");
		//2.打开文件
		FileInputStream fis=new FileInputStream(path);
		//3.做一个缓冲字节数组
		byte [] buffer=new byte[1024];
		int len=0;//len表示实际读取的字节
		OutputStream os=response.getOutputStream();
		while((len=fis.read(buffer))!=-1){
			//返回
			os.write(buffer, 0, len);
		}
		//关闭
		os.close();
		fis.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
