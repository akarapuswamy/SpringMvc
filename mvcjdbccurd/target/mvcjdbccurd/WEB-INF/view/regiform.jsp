<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>ADD new Employee</h1>

<a href="./add">NEWEMPLOYEE</a>
<form action="/insert" method="post">
<p>
      <label>ID : <input type="text" /></label>
    </p>
  
<p>
      <label>NAME : <input type="name" /></label>
    </p>
    
  <p>
      <label>LASTNAME : <input type="lastname" /></label>
    </p> 
    
   <p>
      <label>ADDRESS : <input type="address" /></label>
    </p>  
     <p>
      <label>SALARY : <input type="text" /></label>
    </p>  
    
<p>
       <button type="submit">Submit</button>
    </p>
   </form>

</body>
</html>