package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servletf1�Ὣ����ת������Servlet,��servlet�ȿ���������Ӧͷ,Ҳ����������Ӧ��
public class Servletf2 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("tow Servlet");
		//������Ӧ��
		response.getWriter().print("hell tow...");
		
		//��request����ȡ����
		System.out.println(request.getAttribute("username"));
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
