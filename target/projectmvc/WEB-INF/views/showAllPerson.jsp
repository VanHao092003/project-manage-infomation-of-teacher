<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>thông tin người dùng</h1>
	<table>
		<tr>
			<th>ID: </th>
			<th>Full name: </th>
			<th>Age: </th>
			<th>Home town: </th>
			<th>hary salary: </th>
			<th>Bonus: </th>
			<th>Fine: </th>
			<th>chi tiết</th>
<!-- 			<th>Salary: </th>
 -->	</tr>
 		<c:forEach items="persons" var="person">
 			<tr>
 				<th>${person.code }</th>
 				<th>${person.name }</th>
 				<th>${person.age }</th>
 				<th>${person.homeTown }</th>
 				<th>${person.hardSalary }</th>
 				<th>${person.bonus }</th>
 				<th>${person.fine }</th>
 				<th><a href="/chi-tiet-nguoi-dung/${person.code}">chi tiet</a></th>
 			</tr>
 		</c:forEach>
	</table>
</body>
</html>