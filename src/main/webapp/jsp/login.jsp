<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	<div align="center">
		<h1>登录</h1>
		<dir><h3><font color="red">${error }</font></h3></dir>
		<hr>
		<form action="${pageContext.request.contextPath }/login" method="post">
			用户名：<input type="text" name="username"/><br>
			密码：<input type="password" name="password"/><br>
				 <input type="checkbox" name="rememberMe" value="true"/>Remember Me? </br>
			<input type="submit" value="登录" />
		</form>
	</div>
</body>
</html>