<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加用户</title>
</head>
<body>
<div>
	<div>
		<h1><font>${message }</font></h1>
	</div>
	<form action="${pageContext.request.contextPath }/userAdd" method="post">
		用户ID：<input type="text" name="id" /><br>
		用户名：<input type="text" name="name" /><br>
		用户密码：<input type="text" name="password" /><br>
		<input type="submit" value="添加" />
	</form>
</div>
</body>
</html>