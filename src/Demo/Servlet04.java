package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet04 extends HttpServlet {

	/*
	 * ʹ��Referer����ͷ,��ֹ����
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String referer=request.getHeader("Referer");
		System.out.println(referer);
		//ֻҪ���Ǳ�վ����������,������֯�����,������ת���ٶȻ��߷���404
		if(referer==null||!referer.contains("localhost")){
			//�ض�λ���ٶ�
			response.sendRedirect("http://www.baidu.com");
		}else{
			System.out.println("hello");
		}
	}

}
