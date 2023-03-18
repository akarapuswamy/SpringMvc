<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>new Employee</h1>

<form action="/insert"> method="post"</form>

<label for="id">ID:</label>
<input type="number" name="id"><br><br>

<label for="name">Name:</label>
<input type="text" name="name"><br><br>

<label for="lastName">LastName:</label>
<input type="text" name="lastName"><br><br>

<label for="address">Address:</label>
<input type="text" name="address"><br><br>



<label for="salary">Salary:</label>
<input type="text" name="salary"><br><br>


<input type="submit" value="enter"><br><br>

</body>
</html>