<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add</title>
</head>
<body>
	<form:form modelAttribute="customer">
		<table>
			<form:input path="id" type="hidden"  value="${customer.id}"/>
			<tr>
				<td>Name: </td>
				<td><form:input path="name" value="${customer.name}"/></td>
			</tr>
			<tr>
				<td>City:</td>
				<td><form:input path="city" value="${customer.city}"/></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age"  value="${customer.age}"/></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Save Changes"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>