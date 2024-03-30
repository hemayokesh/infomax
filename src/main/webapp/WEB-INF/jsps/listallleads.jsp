<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>List Of All Leads</h2>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email Id</th>
<th>Mobile No</th>
</tr>
<c:foreach var="leads" items="leads">
<tr>
<td>${leads.fname }</td>
<td>${leads.lname }</td>
<td>${leads.email}</td>
<td>${leads.mobile }</td>
</tr>
</c:foreach>
</table>
</body>
</html>