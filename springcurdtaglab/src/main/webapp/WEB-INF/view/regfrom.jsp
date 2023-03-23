<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Registration Form</h1>


 <form action="./saved" method="post">
   <table style="with: 80%">
    <tr>
     <td>Emp ID</td>
     <td><input type="text" name="id" /></td>
    </tr>
    <tr>
     <td>Emp Name</td>
     <td><input type="text" name="Name" /></td>
    </tr>
    <tr>
     <td>Emp Address</td>
     <td><input type="text" name="Address" /></td>
    </tr>
    <tr>
     <td>Emp salary</td>
     <td><input type="text" name="salary" /></td>
    </tr>
   </table>
   <input type="submit" value="Register" />
  </form>
</form>
</body>
</html>