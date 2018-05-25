<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>
<div>
	<table>
		<tr>
			<td>用户ID</td>
			<td>用户名</td>
			<td>用户密码</td>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td><c:out value="${user.id }"></c:out></td>
				<td><c:out value="${user.name }"></c:out></td>
				<td><c:out value="${user.password }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>