<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>frog 69</title>
</head>
<body>

<h1> <c:out value="${products.name}"></c:out> </h1>


				
				<form action="/products/${products.id}" method="POST">
		<label for="category">Category:</label> 
			<select name="category">
				<c:forEach items="${categories}" var="category">
					<option value="${category.id}">
						<c:out value="${category.name}" />
					</option>
				</c:forEach>
			</select><br><br> 
			<input type="submit" value="Add Category">
	</form>
 			<c:forEach items="${products.categories }" var="category">
			<li><c:out value="${category.name}" /></li>
		</c:forEach>
			
		
</body>
</html>