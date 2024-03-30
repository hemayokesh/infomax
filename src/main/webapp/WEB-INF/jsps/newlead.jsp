<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Lead </h2>
<form action ="savelead" method="post">
<pre>
First Name :<input type="text" name="fname"/>

Last Name  :<input type="text" name="lname"/>

Email      :<input type="email" name="email"/>

Mobile     :<input type="number" name="mobile"/>

            <input type="submit" value="Save Lead Data"/>
</pre>
</form>
</body>
</html>