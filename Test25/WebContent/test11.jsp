<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("name", "박은성");
	pageContext.setAttribute("age", "25");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>디렉티브를 이용한 :데이터를 전달include</h2>
	<%@ include file="inFile.jsp"%>
	<hr>
	<h2>액션태그를 이용한 :데이터를 전달불가능 include</h2>
	 <jsp:include page ="inFile.jsp">></jsp:include> 
	<hr>
</body>
</html>