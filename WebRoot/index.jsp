<!-- 一种jsp指令,特殊的标签 -->
<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<!-- 向页面输出basePath,base的href相当于写在了每一个href之前 -->
  	<!-- 没什么用 -->
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
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
    This is my JSP page. <br>
    <a href="hello.html">hello</a>
    <!-- 局部变量 -->
    <%
    	int a=10;
    %>
    <%
    	out.print(a);
    %>
    <br/>
    <%=a %>
    <br/>
    <!-- 声明,成员变量 -->
    <%!
		int a=20; 
    	public void fun1(){
    		System.out.println(a);
    	}
    %>
    <!-- 默认输出成员变量 -->
    <%
    	out.print(this.a++);
    	fun1();
    %>
  </body>
</html>



