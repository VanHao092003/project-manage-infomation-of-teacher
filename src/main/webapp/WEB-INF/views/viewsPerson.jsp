<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> thông tin giáo viên</h1>
	<p>ID: ${person1.code }</p>
	<p>Full name: ${person1.name}</p>
	<p>Age: ${person1.age }</p>
 	<p>Home town: ${person1.homeTown }</p>
 	<p>Hary salary: ${person1.hardSalary }</p>
 	<p>Bonus: ${person1.bonus }</p>
 	<p>Fine: ${person1.fine }</p>
 	
 	<a href='<c:url value="/showAllPerson"/>'>back</a>
</body>
</html>