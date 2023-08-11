<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hibernate Annotation</title>
</head>
<body>
	<h3>Insert Operation</h3>
	<form action="AddEmployee" method="post">
		<table>
			<tr>
				<td style="width:100px">Emp. ID</td>
				<td> <input type="text" name="id" /> </td>
			</tr>
			<tr>
				<td style="width:100px">Emp. Name</td>
				<td> <input type="text" name="name" /> </td>
			</tr>
			<tr>
				<td style="width:100px">Department</td>
				<td> <input type="text" name="dept" /> </td>
			</tr>
		</table>
		<input type="submit" value="SAVE" />
	</form>
	<a href="GetEmployees">Get Employees</a>
</body>
</html>