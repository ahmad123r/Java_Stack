<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/songs" >add New </a>
<a href="/songs/topTen" >Top songs</a>

<form method="POST" action="/search">
    <label>search: <input type="text" name="name"></label>
    
    <button>search</button>
</form>
<table>
<tr>
		<th>name</th>
		<th> rating </th>
		<th>action</th> </tr>
<c:forEach items="${songs}" var="song">
    <tr>      
        <td> <a href="/song/${song.id}" > ${song.name} </a> </td>
        <td>${song.rating}</td>
        <td> <a href="/delete/ ${song.id}" >delete</a> </td>
        
    </tr>
</c:forEach>
</table>

</body>
</html>