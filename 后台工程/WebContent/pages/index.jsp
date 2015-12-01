<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>login success!</h1>
<h1>用户名：<s:property value="id"/></h1>
<h1>密码：<s:property value="password"/></h1>
<h1>返回结果:</h1>
<div><s:property value="#application.samplelists"/></div>
</body>
</html>