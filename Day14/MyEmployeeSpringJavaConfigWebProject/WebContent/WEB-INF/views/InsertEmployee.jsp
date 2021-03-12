<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter Employee Details</h2>
<form action="./saveEmp" method="post">
Enter Employee ID : <input type="text" name="empId"><br><br>
Enter Employee Name : <input type="text" name="empName"><br><br>
Select Employee Designation : <select name="desig">
	<option value="Associate">Associate</option>
	<option value="Sr. Associate">Sr. Associate</option>
	<option value="Manager">Manager</option>
	<option value="Executive">Executive</option>
</select><br><br>
Select Department : <input type="radio" name="deptt" value="IT">IT
<input type="radio" name="deptt" value="Sales">Sales
<input type="radio" name="deptt" value="Purchase">Purchase
<input type="radio" name="deptt" value="Marketing">Marketing
<input type="radio" name="deptt" value="HR">HR<br><br>
<br><br>
Enter Employee Salary : <input type="text" name=salary>
<br><br>
<input type="submit" value="Save Employee">
</form>
<br><br>
<a href="./">Go Back</a>
</body>
</html>