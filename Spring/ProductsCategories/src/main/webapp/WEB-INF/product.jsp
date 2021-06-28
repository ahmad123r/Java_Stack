<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="css/product.css">
<title>Products</title>
</head>
<body>
<div class="container">
<h1>Add a new product below:</h1>
<form:form action="/product/create" method="POST" modelAttribute="product">
		<div>

			<form:label class="col-sm-2 col-form-label" path="name"> Name</form:label>
			<form:input  class="form-control" path="name" />
			<form:errors path="name" />
		</div>
		<div>

			<form:label class="col-sm-2 col-form-label" path="description"> Description</form:label>
			<form:input  class="form-control" path="description" />
			<form:errors path="description" />
		</div>
		<div>

			<form:label class="col-sm-2 col-form-label" path="price"> Price (decimal)</form:label>
			<form:input class="form-control"  path="price"/>
			<form:errors path="price" />
		</div>
		
		<button class="btn btn-primary mb-3">Add product!</button>

	</form:form>
	</div>

</body>
</html>