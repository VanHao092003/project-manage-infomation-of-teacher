<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:url value="/update" var="url"></c:url>
	<form:form action="${url}" method="POST" modelAttribute="person2" enctype="multipart/form-data">
		<p>ID: <form:input path="code"/></p>
		<p style="color: red;"><form:errors path="code"></form:errors> </p>
		<p>Full name: <form:input path="name"/></p>
		<p style="color: red;"><form:errors path="name"></form:errors> </p>
		<p>Age: <form:input path="age"/></p>
		<p style="color: red;"><form:errors path="age"></form:errors> </p>
		<p>Home town: <form:input path="homeTown"/></p>
		<p style="color: red;"><form:errors path="homeTown"></form:errors> </p>
		<p>Hard salary: <form:input path="hardSalary"/></p>
		<p style="color: red;"><form:errors path="hardSalary"></form:errors> </p>
		<p>Bonus: <form:input path="bonus"/></p>
		<p>Fine: <form:input path="fine"/></p>
		<form:button type="submit">Submit</form:button>
	</form:form>
</body>
</html>