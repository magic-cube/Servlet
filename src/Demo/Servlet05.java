package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ͨ��request��ȡurl����ط���
 */
public class Servlet05 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.print(request.getScheme()+"<br/>");//��ȡ����Э��
		pw.print(request.getServerName()+"<br/>");//��ȡ����������
		pw.print(request.getServerPort()+"<br/>");//��ȡ�������˿ں�
		pw.print(request.getContextPath()+"<br>");//��ȡ��Ŀ����
		pw.print(request.getServletPath()+"<br/>");//��ȡServlet·��
		pw.print(request.getQueryString()+"<br/>");//��ȡ��������
		pw.print(request.getRequestURI());//��ȡ����URl
		pw.print(request.getRequestURL());//��ȡ����URL
		
	}

}
