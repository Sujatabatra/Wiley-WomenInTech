<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<table border="1">
	<tr>
		<th>Employee ID</th>
		<th>Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
	</tr>
	<tr>
		<td>${employee.eId }</td>
		<td>${employee.eName }</td>
		<td>${employee.eDesig }</td>
		<td>${employee.eDepart }</td>
		<td>${employee.salary }</td>
	</tr>
</table>
<br><br>
<a href="./">Go To Main Page</a>
</body>
</html>