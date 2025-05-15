<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Telusko</title>
</head>
<body>
	<form:form method="POST" modelAttribute="user">
		ID: <form:input  path="id" type="text"/><br>
		Email Address: <form:input path="emailAddress" type="email"/><br>
		Username: <form:input path="uname" type="text"/><br>
		Password: <form:input path="pwd" type="password"/><br>
		<form:input path="createdAt" type="hidden"/>
		
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>