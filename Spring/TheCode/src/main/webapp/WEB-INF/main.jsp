<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:red"><c:out value="${error}"/></h1> 
<form action="/mm"  method="POST">
<h3>What is the secret key is? <input name="se" > </h3>
<button type="submit" >Enter</button>

</form>

</body>
</html>