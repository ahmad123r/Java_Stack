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

<h1>New Contact</h1>

	<form:form action="/new" method="POST" modelAttribute="lin">
		<div class="form-group">
		        <form:label path="person">Person</form:label>
		        <form:errors path="person"/>
		        <form:select class="form-control" path="person">
		        <c:forEach items="${ att }" var="p">
		        	<form:option value="${ p.id }">${ p.firstName } ${ p.lastName }</form:option>
		        </c:forEach>
		        </form:select>
		    </div>
			<div class="form-group">
		        <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:input class="form-control" path="state"/>
		    </div>
		    <div class="form-group">
		        <form:label path="ExpirationDate">Expiration Date</form:label>
		        <form:errors path="ExpirationDate"/>
		        <form:input type="date" class="form-control" path="ExpirationDate"/>
		    </div>
		    <button>Add License</button>
		
</form:form>
</body>
</html>