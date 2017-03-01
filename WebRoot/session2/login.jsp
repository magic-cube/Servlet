<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
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
  <%--本页面提供登录表单,还要显示错误信息 --%>
  <h1>login</h1>
  <%
  	//读取名为username的cookie,
  	//为空显示"",如果不为空,显示到文本框
  	String uname="";
  	Cookie[] cs=request.getCookies();//获取请求中所有的cookie
  	if(cs!=null){
  		//查找名为username的
  		for(Cookie c:cs){
  			if("username".equals(c.getName())){
  				uname=c.getValue();
  			}
  		}
  	}
  %>
  <%
  	//空字符串输出不会影响页面效果
  	String message="";
  	//需要判空
  	String msg=(String)request.getAttribute("msg");
  	if(msg!=null){
  		message=msg;
  	}
  %>
    <font color="red"><%=message %></font>
  	<form action="/Servlet/LoginServlet" method="post">
		username:<input type="text" name="username" value="<%=uname%>"/><br/>
		password:<input type="password" name="password"/><br/> 
		<input type="submit" value="login"/> 		
  	</form>
  	
  </body>
</html>




