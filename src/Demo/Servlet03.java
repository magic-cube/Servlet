package Demo;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet03 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		//����ֽ���
//		String s="hello outputstream";
//		byte[] bytes=s.getBytes();
//		response.getOutputStream().write(bytes);
		
		
		//���Է�װ��һ������
		ServletOutputStream sos=response.getOutputStream();
		//����ͼƬ
		File f=new File("C:/1.jpg");
		FileInputStream is=new FileInputStream(f);

		//������
		/*byte [] bytes=new byte[1024];
		
		int len=0;
		while((is.read(bytes)!=-1)){
			sos.write(bytes);
		}*/
		
		byte[] bytes=IOUtils.toByteArray(is);
		sos.write(bytes);
		
		
	}

}




