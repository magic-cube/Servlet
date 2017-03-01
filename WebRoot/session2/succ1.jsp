<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'succ1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
	<h1>suuc1</h1>
	
	<%
		String username=(String)session.getAttribute("username");
		if(username==null){
			/*
			1.向request域中保存错误信息,转发到login.jsp中
			*/
			request.setAttribute("msg", "you are not login");
			//转发
			RequestDispatcher rd=request.getRequestDispatcher("/session2/login.jsp");
			rd.forward(request, response);
			//request.getRequestDispatcher("/session2/longin.jsp").forward(request, response);
			return;
		}
	%>
	welcome <%=username %>!<br>
	<a href="/Servlet/session2/succ2.jsp">to succ2</a>
  </body>
</html>



