<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <div>
		<shiro:user>
		    Welcome back John!  Not John? Click <a href="login.jsp">here<a> to login.
		</shiro:user>
	</div> -->
	<!-- property中的内容应该与实体类中的命名一致 -->
	<shiro:principal property="name" />
	<div>
		<shiro:authenticated>
			<button>登录可见</button>
		</shiro:authenticated>
		<shiro:notAuthenticated>
			<button>匿名可见</button>
		</shiro:notAuthenticated>
		<shiro:hasAnyRoles name="user,admin">
			<button>user或者admin用户可见</button>
		</shiro:hasAnyRoles>
		<shiro:hasRole name="user">
			<button>仅user可见</button>
		</shiro:hasRole>
		<shiro:lacksRole name="user">
			<button>除user以外的用户可见</button>
		</shiro:lacksRole>
		<shiro:hasPermission name="user:list">
			<button>拥有user:list权限可见</button>
		</shiro:hasPermission>
		<shiro:lacksPermission name="user:list">
			<button>除拥有user:list权限以外的可见</button>
		</shiro:lacksPermission>
	</div>
</body>
</html>