package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CServlet extends BServlet {
	
	//�˴����ܸ��Ǹ����init����,�ᵼ�¸����configû�ܱ���ֵ
	//���Ǹ����Լ������init(),Ȼ���ڸ���ʵ�ֵ�Servlet�ӿڵ�init()�е����Լ���init
	@Override
	/*
	 * �ص�
	 */
	public void init() {
		//�ڴ˴�����ɳ�ʼ��,�ᱻ�����init��������
		System.out.println();
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		String value=getInitParameter("p1");
	}
}
