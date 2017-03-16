<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>管理员测试页</title>
</head>
<body>
<form action="managerAction!find" method="post">
    	用户名:<input type="text" name="manager.managerName" value="wangdadou"/><br/>
    	密码:<input type="password" name="manager.managerPassword" value="123456"/><br/>
    	<input type="submit" value="提交">
    </form>
</body>
</html>