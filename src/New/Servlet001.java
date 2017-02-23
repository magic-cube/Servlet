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
 * 测试request获取请求参数
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
		
		//获取多值
		String [] hobby=request.getParameterValues("hobby");
		System.out.println(username+","+password+","+Arrays.toString(hobby));
	
		/*
		 * 获取所有请求参数名称
		 */
		Enumeration names=request.getParameterNames();
		while(names.hasMoreElements()){
			System.out.println(names.nextElement());
		}
		
		
		/*
		 * *****
		 * 获取所有请求参数,封装到map中
		 * 键为参数名,参数值为数组,单值也用数组装
		 */
		Map<String,String[]> map=request.getParameterMap();
		for(String name:map.keySet()){
			String [] values=map.get(name);
			System.out.println(name + " = " + Arrays.toString(values));
		}
	}
	

}
