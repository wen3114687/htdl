<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>测试页面</title>
</head>
<body>

	<form action="login">
	<label accesskey="loginname">登录名：</label>
		<input type="text" name="loginname"><br>
		
		<label accesskey="password">密码：</label>
		<input type="text" name="password"><br>
		<input type="submit" value="提交">
	</form>	


	<a href="saveUser?name=admin">saveUser</a>
	<a href="roleManage/list">roleManage</a>
	<a href="hello">你好</a>
</body>
</html>