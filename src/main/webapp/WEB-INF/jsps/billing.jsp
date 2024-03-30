<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Bill </h2>
<form action ="saveleadsbill" method="post">
<pre>
<input type="hidden" name="id" value="${contact.id }"/>
First Name :<input type="text" name="fname" value="${contact.fname }"/>

Last Name  :<input type="text" name="lname" value="${contact.lname }"/>

Email      :<input type="email" name="email" value="${contact.email }"/>

Mobile     :<input type="number" name="mobile" value="${contact.mobile}"/>


Product name:<input type="text" name="pname"/>

Quantity   :<input type="number" name="quantity"/>

Price      :<input type="number" name="price"/>

            <input type="submit" value="Save Bill"/>
</pre>
</form>
</body>
</html>