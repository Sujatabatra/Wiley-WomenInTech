<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Delete Employee By ID</h2>
<form action="./deleteEmp" method="post">
	Enter Employee ID : <input type="text" name="empId"><br><br>
	<input type="submit" value="Delete">
</form>
<br><br>
<a href="./">Go Back</a>
</body>
</html>