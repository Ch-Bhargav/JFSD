<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<%@ page import="java.util.*"  %>
	<%@ page import="com.model.*"  %>
	<% @SuppressWarnings("unchecked") List<Employee> list = (List<Employee>) request.getAttribute("elist"); %>
	<table border="1">
		<tr>
			<th>EID</th><th>ENAME</th><th>EDEPT</th>
		</tr>
		<%for(Employee E : list) {%>
			<tr>
				<td><%= E.getId() %></td>
				<td><%= E.getName() %></td>
				<td><%= E.getDept() %></td>
			</tr>
		<%} %>
	</table>
	
</body>
</html>