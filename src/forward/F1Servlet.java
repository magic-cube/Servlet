package forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * ����ת����Servletf2
 * ����ת�����ض��������:
 * 1,����ת����һ������һ����Ӧ,�ض�������������,������Ӧ
 * 2,����ת����ַ�����仯,�ض�����ʾ��һ������ĵ�ַ
 * 3,����ת��ֻ��ת��������Ŀ������Servlet
 * 
 */
public class F1Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("OneServlet...");
		//������Ӧͷ
		response.setHeader("aaa", "AAA");
		//�˴�Ӧ������ͷ������,ֻ��������Ӧͷ,����������Ӧ��
		response.getWriter().print("hello one.");
		
		/*
		 * ��request�������һ������
		 */
		request.setAttribute("username", "hc");
		
		//����ת��,��ͬ�ڵ���Servletf2��service()����
		request.getRequestDispatcher("/Servletf2").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
