<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String userId ="박은성";
	String userName= "pes";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	
	if(id.equals(userId)&& name.equals(userName)){
		 session.setAttribute("sid", id);
		 session.setAttribute("sname", name);
		 response.sendRedirect("login.jsp");
	}
%>
</body>
</html>