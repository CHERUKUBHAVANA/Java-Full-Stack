<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/college" user="root" password="1234"></sql:setDataSource>
	<sql:query var="rs" dataSource="${db}">
		select * from student
	</sql:query>
	<c:forEach items="${rs.rows}" var="stu">
		<c:out value="${stu.student_id}"></c:out> : <c:out value="${stu.name}"></c:out><br>
	</c:forEach>
</body>
</html>