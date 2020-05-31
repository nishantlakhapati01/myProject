<%@page import="com.cjc.main.model.Employee"%>
<html>
<head>
<h2 align="center">Lakhapati Oil Refinary</h2>
<h4 align="center">Update Employee Details</h4>
</head>
<body>
<form action="update">
<table border="2" align="center">
<tr>
<%Employee emp = (Employee)request.getAttribute("data"); %>
<td>Id</td>
<td><input type="hidden" name="id" value=<%=emp.getId() %>><%=emp.getId() %></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" name="name" value=<%=emp.getName() %>></td>
</tr>
<tr>
<td>MobileNo</td>
<td><input type="text" name="mobno" value=<%=emp.getMobno() %>></td>
</tr>
<tr>
<td>UserName</td>
<td><input type="text" name="username" value=<%=emp.getUsername() %>></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password" value=<%=emp.getPassword() %>></td>
</tr>
<tr>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form>
</body>
</html>