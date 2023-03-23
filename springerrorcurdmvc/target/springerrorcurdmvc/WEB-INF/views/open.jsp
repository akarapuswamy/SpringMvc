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
<h1> Person Registration Form</h1>

  <form action="./insert" method="post" >
   <table style="with: 80%">
    <tr>
     <td>Person ID</td>
     <td><input type="text" name="id" /></td>
    </tr>
    <tr>
     <td>Person Name</td>
     <td><input type="text" name="name"/></td>
    </tr>
    <tr>
     <td>Person Address</td>
     <td><input type="text" name="address" /></td>
    </tr>
   </table>
   <input type="submit" value="Register" />
  </form>
 </div>

</body>
</html>