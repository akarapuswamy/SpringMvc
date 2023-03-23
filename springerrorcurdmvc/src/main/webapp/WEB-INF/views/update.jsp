<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Person Update Form</h1>
  <form action="./update" method="post">
   <table style="with: 80%">
    <tr>
     <td>Person ID</td>
     <td><input type="text" name="id" value="${e.id}" readonly="readonly" /></td>
    </tr>
    <tr>
     <td>Person Name</td>
     <td><input type="text" name="name" value="${e.name}" /></td>
    </tr>
    <tr>
     <td>Person Address</td>
     <td><input type="text" name="des" value="${e.address}"/></td>
    </tr>
   
   </table>
   <input type="submit" value="update" />
  </form>
 </div>
</body>
</html>