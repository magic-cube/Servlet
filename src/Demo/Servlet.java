package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ��ȡ�ͻ���ip,��ȡ���󷽷�,��ȡUser-Agent,
 * �õ��ͻ��˵���Ϣ(����ϵͳ,�����)
 */
public class Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 
		//��ȡip��ַ
		String addr=request.getRemoteAddr();
		System.out.println("IP:"+addr);
		//��ȡ����ʽ
		System.out.println("����ʽ:"+request.getMethod());
		
		String userAgent=request.getHeader("User-Agent");
		
		if(userAgent.toLowerCase().contains("chrome")){
			System.out.println("���õ��ǹȸ������");
		}else if(userAgent.toLowerCase().contains("msie")){
			System.out.println("���õ���ie");
		}
		
		System.out.println(userAgent);
	}

}


