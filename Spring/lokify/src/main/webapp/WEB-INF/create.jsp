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
<form action="/songs1" method="POST">
<p>name <input name="name" > </p>
<p>title <input name="title" > </p>
<label for="rating">Rating:</label>

<select id="rating" name="rating">
  <option value="1"> 1 </option>
   <option value="2"> 2 </option>
    <option value="3"> 3 </option>
     <option value="4"> 4 </option> 
      <option value="5"> 5 </option>
       <option value="6"> 6 </option>
       <option value="7"> 7 </option>
       <option value="8"> 8 </option>
       <option value="9"> 9 </option>
       <option value="10"> 10 </option>
       
       

  
</select>
<button type="submit">add new</button>

   


</form>

</body>
</html>