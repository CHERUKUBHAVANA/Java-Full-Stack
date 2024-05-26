<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String url = "jdbc:mysql://localhost:3306/college";
		String userName = "root";
		String password = "1234";
		String sql = "select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()){
			out.print("Roll Number : "+rs.getInt(1)+"<br>");
			out.print("Name : "+rs.getString(2)+"<br>");
		}
	%>
</body>
</html>