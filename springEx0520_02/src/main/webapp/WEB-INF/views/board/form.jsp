<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>로그인 페이지</h2>
		<form action = "formOk" method = "get"  name = "prac">
			<label>ID : </label><input type = "text" name = "id">
			<p></p>
			<label>PW : </label><input type = "password" name = "pw">
			<p></p>
			<input type = "submit" value = "전송">
			<input type = "reset" value = "취소">
		</form>		
	</body>
</html>