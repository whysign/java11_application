<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %><%-- 다른서버의 코드를가져오는법  --%>
 
 <%--1.각주 (Comment):해당 코딩에 대한 설명부  --%>
 <%--2.<%@디렉티브(Directive) %> : 현재 페이지에 필요한 설정이나 리소스 로딩 --%>
 <%--3.<%!  %>선언문:거의안쓴다(Declare):익명의 클래스로서 현재 문서에서만 유효--%>
 <%--4.<%자바명(Scriptlet)%>: 해당페이지에 자바 언어로 프로그래밍한 코드부   --%>
 <%--5.<%= 표현식:많이쓴다.(출력) %>:해당 결과를 출력 또는 표현  --%>
 <%! 
 private String name;
 public String getName(){
	return this.name;
 }
 public void setName(String name){
	 this.name =name;
 }
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
 	String title = "메인 페이지";
 %>
<title><%=title %></title>
</head>
<body>
<%
	setName("박은성");
%>
<h2><%=getName() %>의 홈페이지</h2>
<hr>

</body>
</html>