<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href='<c:url value="/resources/css/showAllPerson.css"/>' >
<title>Insert title here</title>
</head>
<body>
	<h3 class="header1">danh sách thông tin người dùng</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>Full name</th>
			<th>Age</th>
			<th>Home town</th>
			<th>hary salary</th>
			<th>Bonus</th>
			<th>Fine</th>
			<th>chi tiết</th>
<!-- 			<th>Salary: </th>
 -->	</tr>
 		<c:forEach items="${persons }" var="person">
 			<tr>
 				<th>${person.code }</th>
 				<th>${person.name }</th>
 				<th>${person.age }</th>
 				<th>${person.homeTown }</th>
 				<th>${person.hardSalary }</th>
 				<th>${person.bonus }</th>
 				<th>${person.fine }</th>
 				<th class="cursor"><a href='<c:url value="/chi-tiet-nguoi-dung/${person.code}"/>'><button>chi tiet</button></a></th>
 				<th class="cursor"><a href='<c:url value="/delete/${person.code}"/>'><button>xoa</button> </a></th>
 				<th class="cursor"><a href='<c:url value="/update/${person.code}"/>'><button>update</button> </a></th>
 			</tr>
 		</c:forEach>
 		
	</table>
	<button class="add"><p class="cursor " ><a href='<c:url value="/addPerson"/>'>them ngươi dùng</a></p></button>
	
</body>
</html>