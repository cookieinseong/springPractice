<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "joinOk" method = "get">
	<h2>회원가입</h2>
	<label>학생번호</label><input type = "text" name = "stu_num">
	<p></p>
	<label>학생이름</label><input type = "text" name = "stu_name">
	<p></p>
	<label>국어</label><input type = "text" name = "kor">
	<p></p>
	<label>영어</label><input type = "text" name = "eng">
	<p></p>
	<label>수학</label><input type = "text" name = "math">
	<p></p>
	<label>합계</label><input type = "text" name = "total">
	<p></p>
	<label>평균</label><input type = "text" name = "avg">
	<p></p>
	<input type = "submit" value = "입력">
	<input type = "reset" value = "취소">
	</form>
</body>
</html>