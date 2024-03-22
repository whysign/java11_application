<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 8 객체</title>
</head>
<body>
<h2>JSP 내장객체</h2>
<p>out :브라우저에 출력할 경우 사용</p>
<p>request: 요청 정보를 담는 객체</p>
<p>response: 응답 정보를 담는 객체</p>
<p>session: 세션 정보를 담는 객체(로그인,로그아웃 을 하게끔하는 기능)</p>
<p>application : 웹 애플리케이션 정보를 담는 객체</p>
<p>config :웹 설정 정보를 담는 객체</p>
<p>page : 웹 페이지 정보를 담는 객체</p>
<p>exception : 예외 처리 정보를 담는 객체(error 페이지를 담는 객체)</p>
<%
	//Servlet에서 page 객체 생성하기
	//HttpServlet spageContext = new HttpServlet();
	//Object spage = spageContext.getPage();
	
	//Servlet에서 out 객체 생성하기
	//PrintWriter out = response.getWriter();
	
	//Servlet에서 request 객체 생성하기
	//ServletRequest request = pageContext.getRequest();
	
	//Servlet에서 response 객체 생성하기
	//ServletResponse response =pageContext.getResponse();
	
	//Servlet에서 session 객체 생성하기  (가장 많이 사용할 객체)
	//HttpSession session = pageContext.getSession();
	
	//Servlet에서 application 객체 생성하기
	//ServletContext application = pageContext.getServletContext();
	
	//Servlet에서 config 객체 생성하기
	//ServletConfig config =pageContext.getServletConfig();
	
	//Servlet에서 exception 객체 생성하기
	//ServletException exception =pageContext.getException();
	
	//Servlet 에서 jsp 객체 생성하기 
	//JspWriter jspOut = pageContext.getOut();
	//<br> : 줄바꿈
	String name ="박은성";
	out.println("<h2>"+name+"</h2>");//<h2><%=name %></h2> 둘다 똑같은 명령어다 	
	out.println("<br>"); 
%>
<h2><%=name %></h2>
<%
	JspWriter jspOut =pageContext.getOut();
	out.println("<h2>out(출력) : 태그를 포함한 내용을 출력할 수 있는 객체</h2>");
	out.println(jspOut == out);
	
	ServletRequest jspReq = pageContext.getRequest();
	out.println("<h2>request(요청) : 브라우저를 통하여 요청한 정보를 저장하는 객체</h2>");
	out.println(jspReq== out);
	
	ServletResponse jspRes =pageContext.getResponse();
	out.println("<h2>response(응답) : 브라우저를 통하여 반환한 결과를 저장하는 객체</h2>");
	out.println(jspRes== session);
	
	HttpSession jspSes = pageContext.getSession();
	out.println("<h2>session(세션) : 인가된 사용자 정보를 저장하는 객체</h2>");
	out.println("<h3>session(세션)은 로그아웃 전 또는 브라우저를 종료 하기 전까지 그정보가 유지된다</h3>");
	out.println(jspSes== out);
	
	ServletContext jspApp = pageContext.getServletContext();
	out.println("<h2>application(앱)) : 인가된 사용자 정보를 저장하는 객체</h2>>");
	out.println("<h3>application(앱))은 브라우저 종료 전까지 그 정보가 유지된다.</h3>>");
	out.println(jspApp==application );
	
	ServletConfig jspCon =pageContext.getServletConfig();
	out.println("<h2>config(설정)) : 애플리케이션 설정 정보를 저장하는 객체</h2>>");
	out.println(jspCon==config );
	
	Exception jspExc =pageContext.getException(); 
	Exception  exception =pageContext.getException(); 
	out.println("<h2>exception(예외처리)) : 예외처리 정보를 저장하는 객체</h2>>");
	out.println(jspExc== exception);
	
	Object jspPage = pageContext.getPage();
	out.println("<h2>page(페이지)) : 예외처리 정보를 저장하는 객체</h2>>");
	out.println("<h3>page(페이지))는 그 정보가 현재 페이지 내에서만 정보가 유지된다.</h3>>");
	
	out.println("<h3>전송된 값은 그 정보가 목적지까지만 유지되며, 다른 페이지에서는 해당 정보를 확인할 수 없다.</h3>>");
	out.println("웹 환경에서의 Scope : 그 정보가 어디까지 유지");
	out.println("page < trans < session < application");
	//session.setAttribute("sid","ktt"); -> 모든 8대 객체에 저장시에는setAttribute("필드명","값")을사용한다
	//session.getAttribute("sid"); ->모든 8대 객체에  값을 가져오는 경우는getAttribute("필드명") 을사용한다 . 단,request 객체의 값을 가져오는 경우는 getParmeter()을쓴다
	

%>
<hr>
<div>
	<a href="test07.jsp">scope(스코프) 자세히알기</a>

</div>
</body>
</html>