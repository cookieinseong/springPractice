<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>form.jsp</h2>
		<form action = "formOk1">
		번호 : <input type = "text" name = "num">
		<p></p>
		제목 : <input type = "text" name = "headline">
		<p></p>
		내용 : <input type = "text" name = "content">
		<p></p>
		날짜 : <input type = "text" name = "date">
		<p></p>
		그룹 : <input type = "text" name = "group">
		<p></p>
		스텝 : <input type = "text" name = "step">
		<p></p>
		들여쓰기 : <input type = "text" name = "indent">
		<p></p>
		<input type = "submit" value = "전송">
		</form>
	</body>
</html>