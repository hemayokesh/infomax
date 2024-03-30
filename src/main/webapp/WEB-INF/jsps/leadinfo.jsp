<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Lead Info</h2>
<form action="savecontact" method="post">
<pre>
<input type="hidden" name="id" value="${lead.id }"/>
First Name :<input type="text" name="fname" value="${lead.fname }"/>

Last Name  :<input type="text" name="lname" value="${lead.lname }"/>

Email      :<input type="email" name="email" value="${lead.email }"/>

Mobile     :<input type="number" name="mobile" value="${lead.mobile}"/>

            <input type="submit" value="Convert"/>
            
            
</pre>
</form>
</body>
</html>