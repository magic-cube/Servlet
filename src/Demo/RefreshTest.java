package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ��ʱˢ��
 * ����Refreshͷ,��ʱˢ��
 */
public class RefreshTest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * ������Ӧ��!,ʹ����
		 */
		PrintWriter writer=response.getWriter();
		//���������
		writer.print("��ӭxxx��¼,5���Ӻ���Զ���ת����ҳ");
		//������ΪRefresh����Ӧͷ
		response.setHeader("Refresh", "5;URL=/Servlet/Servlet01");
		
	}

}
