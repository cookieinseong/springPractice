<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="joinOk" method = "post">
		회원번호 : <input type = "text" name ="mem_num">
		<p></p>
		회원이름 : <input type = "text" name ="mem_name">
		<p></p>
		회원주소 : <input type = "text" name = "mem_address">
		<p></p>
		회원전화번호 : <input type = "text" name = "mem_tell">
		<p></p>
		회원생일 : <input type = "text" name = "mem_birth">
		<p></p>
		<input type = "submit" value = "전송">
	
	</form>
</body>
</html>