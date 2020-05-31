<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="s" %>
<html>
<head>
<h2 align="center">Lakhapati Oil Refinary</h2>
<h4 align="center">Employee Details</h4>
<script type="text/javascript">
function deleteData()
{
    alert("Delete Entry??");
    document.myform.action="delete";
    document.myform.submit();
}
</script>
<script type="text/javascript">
function editData()
{
    alert("Edit Data??");
    document.myform.action="edit";
    document.myform.submit();
}
</script>
</head>
<body>
<form name="myform">
<table border="2" align="center">
<tr>
<th><h4>Id</h4></th>
<th><h4>Name</h4></th>
<th><h4>MobileNo</h4></th>
<th><h4>UserName</h4></th>
<th><h4>Password</h4></th>
<th><h4>Operation</h4></th>
</tr>
<tr>
<s:forEach items="${data }" var="emp">
<td><input type="radio" name="id" value="<s:out value="${emp.id }"/>">${emp.id }</td>
<td><s:out value="${emp.name }"></s:out></td>
<td><s:out value="${emp.mobno }"></s:out></td>
<td><s:out value="${emp.username }"></s:out></td>
<td><s:out value="${emp.password }"></s:out></td>
<td>
<input type="button" value="Delete" onclick="deleteData()">
<input type="button" value="Edit" onclick="editData()">
</td>
</tr>
</s:forEach>
</table>
</form>
</body>
</html>