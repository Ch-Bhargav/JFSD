<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hibernate XML Demo</title>
</head>
<body>
	<h3>Insert Operation</h3>
	<form action="AddEmployee" method="post">
		<table>
			<tr>
				<td style="width:120px">Employee ID</td>
				<td><input type="text" name="id" /> </td>
			</tr>
			<tr>
				<td style="width:120px">Employee Name</td>
				<td><input type="text" name="name" /> </td>
			</tr>
			<tr>
				<td style="width:120px">Employee Dept</td>
				<td><input type="text" name="dept" /> </td>
			</tr>
			<tr>
				<td></td>
				<td> <input type="submit" value="SAVE" /> </td>
			</tr>
		</table>
	</form>
	<h3>Update Operation</h3>
	<form action="UpdateEmployee" method="post">
		<table>
			<tr>
				<td style="width:120px">Employee ID</td>
				<td><input type="text" name="id" /> </td>
			</tr>
			<tr>
				<td style="width:120px">Employee Name</td>
				<td><input type="text" name="name" /> </td>
			</tr>
			<tr>
				<td style="width:120px">Employee Dept</td>
				<td><input type="text" name="dept" /> </td>
			</tr>
			<tr>
				<td></td>
				<td> <input type="submit" value="UPDATE" /> </td>
			</tr>
		</table>
	</form>
	<h3>Delete Operation</h3>
	<form action="DeleteEmployee" method="post">
		<table>
			<tr>
				<td style="width:120px">Employee ID</td>
				<td><input type="text" name="id" /> </td>
			</tr>
	
			<tr>
				<td></td>
				<td> <input type="submit" value="DELETE" /> </td>
			</tr>
		</table>
	</form>
	<a href="GetEmployee">Get Employee Details</a>
</body>
</html>