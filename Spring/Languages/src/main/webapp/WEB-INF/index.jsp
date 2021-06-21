<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Haitham Abbas Languages</title>
</head>
<body>
<h1>All Languages</h1>
<table>
    <thead>
        <tr>
            <th>name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${langs}" var="lang">
        <tr>
            <td><c:out value="${lang.name}"/></td>
            <td><c:out value="${lang.creator}"/></td>
            <td><c:out value="${lang.version}"/></td>
            <td><a href="/langs/delete/${lang.id}">Delete</a> <a href="/langs/edit/${lang.id}">Update</a></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<form:form action="/langs" method="post" modelAttribute="lang">
    <p>
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">creator</form:label>
        <form:errors path="creator"/>
        <form:textarea path="creator"/>
    </p>
    <p>
        <form:label path="version">version</form:label>
        <form:errors path="version"/>
        <form:input path="version"/>
    </p>  
    <input type="submit" value="Submit"/>
</form:form>    

</body>
</html>