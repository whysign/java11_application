<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POST 데이터 전송</title>
</head>
<body>
	<form action="test03_pro.jsp"method="post">
		<label for ="name">이름</label>:
		<input types ="text" name="name"id="name"/><br><br>
		<label for ="age">나이</label>:
		<input type ="number " max="100" min="1" value="20" step="1" name="age"><br><br>
		<label for ="point">점수</label>:
		<input type ="number" min="0" max="100" value="50" step="5" name="point"><br><br>
		<input type = "submit" value ="입력"> &nbsp;&nbsp;&nbsp;&nbsp;
		<input type ="reset" value="초기화">
	</form>	
</body>
</html>