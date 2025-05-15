<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<thead>
		<tr>
			<th>
				Name
			</th>
			<th>
				City
			</th>
			<th>
				Age
			</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var = "customer" items="${customers}">
			<tr>
				<td>
					<c:out value = "${customer.name}"/>
				</td>
				<td>
					<c:out value = "${customer.age}"/>
				</td>
				<td>
					<c:out value = "${customer.city}"/>
				</td>
				<td>
					<c:url var="UpdateLink" value="/update">
						<c:param name="id" value="${customer.id}"></c:param>
					</c:url>
					<a href="${UpdateLink}">Update</a>
				</td>
				<td>
					<c:url var="DeleteLink" value="/delete">
						<c:param name="id" value="${customer.id}"></c:param>
					</c:url>
					<a href="${DeleteLink}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
	<form action="/crmapp/add">
		<input type="submit" value="Add"/>
	</form>
</body>
</html>