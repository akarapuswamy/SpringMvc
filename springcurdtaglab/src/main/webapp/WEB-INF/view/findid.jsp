<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./find" method="post">

<label for="Id">ID:</label>

<input type="number" name="id" value="${e.id}"
readonly="readonly"><br><br>

<label for="Name">name:</label>
<input type="text" name="name" value="${e.name}"><br><br>

<label for="Address">salary:</label>
<input type="text" name="Address" value="${e.address}"><br><br>


<label for="update">salary:</label>
<input type="submit" value="update"><br><br>
</form>

</body>
</html>