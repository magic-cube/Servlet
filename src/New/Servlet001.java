package New;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ����request��ȡ�������
 */
public class Servlet001 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("GET:"+request.getParameter("xxx"));
		System.out.println("GET:"+request.getParameter("yyy"));
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		//��ȡ��ֵ
		String [] hobby=request.getParameterValues("hobby");
		System.out.println(username+","+password+","+Arrays.toString(hobby));
	
		/*
		 * ��ȡ���������������
		 */
		Enumeration names=request.getParameterNames();
		while(names.hasMoreElements()){
			System.out.println(names.nextElement());
		}
		
		
		/*
		 * *****
		 * ��ȡ�����������,��װ��map��
		 * ��Ϊ������,����ֵΪ����,��ֵҲ������װ
		 */
		Map<String,String[]> map=request.getParameterMap();
		for(String name:map.keySet()){
			String [] values=map.get(name);
			System.out.println(name + " = " + Arrays.toString(values));
		}
	}
	

}
