<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>New Student</h1>

	<form:form action="/students/new" method="POST" modelAttribute="per">
		<div>

			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName" />
			<form:input class="form-control" path="firstName" />
		</div>
		<div>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input class="form-control" path="lastName" />
		</div>
		
		<button>Add Student</button>

	</form:form>

</body>
</html>