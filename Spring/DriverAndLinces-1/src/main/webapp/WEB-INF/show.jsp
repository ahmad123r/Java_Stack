<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" 
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>DMV App</title>
</head>
<body>
		<div class="container">
		<h1>${ att.firstName } ${ att.lastName }</h1>
		<p><strong>License Number</strong> ${ att.license.getNumberAsString() }</p>
		<p><strong>Expiration Date</strong> ${ att.license.getExpirationDateFormatted() }</p>
	</div>
</body>
</html>