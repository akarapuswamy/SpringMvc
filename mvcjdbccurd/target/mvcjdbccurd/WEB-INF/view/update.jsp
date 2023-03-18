<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./update" method="post">

<label for="id">ID:</label>
<input type="number" name="id" value="${frind.id}" readonly="readonly"><br><br>

<label for="name">name:</label>
<input type="text" name="name" value="${frind.name}"><br><br>

<label for="lastname">Lastname:</label>
<input type="text" name="lastname" value="${frind.name}"><br><br>

<label for="address">Address:</label>
<input type="text" name="address" value="${frind.name}"><br><br>

<label for="salary">fee:</label>
<input type="text" name="salary" value="${frind.fee}"><br><br>


<input type="submit" value="enter"><br><br>

</form>

</body>
</html>