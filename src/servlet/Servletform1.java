package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletform1 extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取表单中的参数
		String s1=request.getParameter("number1");
		String s2=request.getParameter("number2");
		int num1=Integer.parseInt(s1);
		int num2=Integer.parseInt(s2);
		int sum=num1+num2;
		//结果保存至result域中
		request.setAttribute("result", sum);
		//转发至result.jsp
		request.getRequestDispatcher("/demo/result.jsp").forward(request, response);

	}

}
