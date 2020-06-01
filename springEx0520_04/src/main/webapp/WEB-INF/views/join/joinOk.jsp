<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>joinOk.jsp 페이지 입니다.</h2>
	<h2>학생번호 : ${student.stu_num}</h2>
	<h2>학생이름 : ${student.stu_name}</h2>
	<h2>국어 : ${student.kor}</h2>
	<h2>영어 : ${student.eng}</h2>
	<h2>수학 : ${student.math}</h2>
	<h2>합계 : ${student.total}</h2>
	<h2>평균 : ${student.avg}</h2>
	
</body>
</html>