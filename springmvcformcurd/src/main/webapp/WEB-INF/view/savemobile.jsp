<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saved" method="post" modelAttribute="mobile">

		MOBILE ID: <form:input type="text" path="id" />
		<br>
		<br>
		
		MOBILE NAME: <form:input type="text" path="MobileName"
			style="margin-left:34px;" />
		<br>
		<br> 
		
		MOBILE BRAND: <form:input type="text" path="MobileBrand"
			style="margin-left:10px;" />
		<br>
		<br>
         
         
		MOBILE PRIZE: <form:input type="text" path="prize"
			style="margin-left:10px;" />
		<br>
		<br>


		<input type="submit" value="Enter">
	</form:form>


</body>
</html>