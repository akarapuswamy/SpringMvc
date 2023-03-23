<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./find" method="post">

<label for="id">Person ID:</label>
<input type="number" name="id" value="${e.id}"
readonly="readonly"><br><br>

<label for="Name">Person Name:</label>
<input type="text" name="name" value="${e.name}"><br><br>

<label for="Address">Person Address:</label>
<input type="text" name="address" value="${e.des}"><br><br>

<input type="submit" value="update"><br><br>
</form>
</body>
</html>