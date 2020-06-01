<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script type="text/javascript">
		
		</script>
	</head>
	<body>
		<h2>학생정보</h2>
		<form action = "formOk">
			<label>학번</label><input type = "text" name = "stu_num">
			<p></p>
			<label>이름</label><input type = "text" name = "stu_name">
			<p></p>
			<label>학과</label><input type = "text" name = "stu_major">
			<p></p>
			<label>연락처</label><input type = "text" name = "stu_addr">
			<p></p>
			<input type = "submit" onclick ="check()" value = "입력"></button>
			<input type = "reset" value = "취소">
		</form>
	</body>
</html>