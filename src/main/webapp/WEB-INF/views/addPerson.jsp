<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href='<c:url value="/resources/css/showAllPerson.css"/>' >
<title>Insert title here</title>
</head>
<body>
	<div class="box">
		<h3 class="hearde">nhạp thông tin giáo viên</h3>
		<c:url value="/addPerson" var="url"></c:url>
		<form:form action="${url}" method="POST" modelAttribute="person" enctype="multipart/form-data">
			<div class="information">
				<p class="name">ID: </p>
				<form:input path="code"/>
			</div>
			<p style="color: red;"><form:errors path="code"></form:errors> </p>
			<div class="information">
				<p class="name">Full name: </p>
				<form:input path="name"/>
			</div>
			<p style="color: red;"><form:errors path="name"></form:errors> </p>
			<div class="information">
				<p class="name">Age: </p>
				<form:input path="age" />
			</div>
			<p style="color: red;"><form:errors path="age"></form:errors> </p>
			<div class="information">
				<p class="name">Home town: </p>
				<form:input path="homeTown"/>
			</div>
			<p style="color: red;"><form:errors path="homeTown"></form:errors> </p>
			<div class="information">
				<p class="name">Hard salary: </p>
				<form:input path="hardSalary"/>
			</div>
			<p style="color: red;"><form:errors path="hardSalary"></form:errors> </p>
			<div class="information">
				<p class="name">Bonus: </p>
				<form:input path="bonus"/>
			</div><br/>
			<div class="information">
				<p class="name">Fine: </p>
				<form:input path="fine"/>
			</div><br/>
			<div class="submitFather">
				<form:button class="submit" type="submit">Submit</form:button>
			</div>
		</form:form>
	</div>
</body>
</html>