<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<% 
		pageContext.setAttribute("name", "Bhavana");
	%>
	<%!
		int a = 10;
		int b = 20;
	%>
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i+j;
	%>
	<%="Output is "+k%>
	<br>
	Value of a is : <%=a %>
</body>
</html>