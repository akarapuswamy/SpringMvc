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

<form action="./insert" method="post">
<p>
      <label>ID : <input type="text" name="id" /></label>
    </p>
  
<p>
      <label>NAME : <input type="name" name="Name"/></label>
    </p>
    
  <p>
      <label>LASTNAME : <input type="lastname" name="lastName" /></label>
    </p> 
    
   <p>
      <label>ADDRESS : <input type="address"  name="Address"/></label>
    </p>  
     <p>
      <label>SALARY : <input type="text" name="salary" /></label>
    </p>  
    
<p>
       <input type="submit" value="enter"></button>
    </p>
   </form>

</body>
</html>