<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search Employee By ID</h2>

<spring:form action="./searchEmp" method="post">
	Select Employee ID : <spring:select path="eId">
		<spring:options items="${IDs }"/>
	</spring:select>
	<input type="submit" value="Search">
</spring:form>
<!--  
<form action="./searchEmp" method="post">
	Enter Employee ID : <input type="text" name="empId"><br><br>
	<input type="submit" value="Search">
</form>
-->
<br><br>
<a href="./">Go Back</a>
</body>
</html>