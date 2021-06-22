<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<h1>Name:<c:out value="${songs.name }"></c:out></h1>
<h1>Rating:<c:out value="${songs.rating }"></c:out></h1>
<h1>Title:<c:out value="${songs.title }"></c:out></h1>
<a href="/delete/ ${songs.id}" >delete</a>
<a href="/songs111" >Dashborad</a>
</body>
</html>