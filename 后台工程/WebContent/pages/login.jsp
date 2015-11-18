<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆页面</title>
    <META content="IE=11.0000" http-equiv="X-UA-Compatible">
    <META http-equiv="Content-Type" content="text/html; charset=utf-8"> 
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

</HEAD>
  
<BODY>
<div>
  <div class="register-logo" style="margin-bottom:100px;">
         <h1>教学资源管理系统</h1>
      </div>

<div>
<!--不添加namespace会报警告  -->
        <s:form action="login" method="post" namespace="/">
          <div>
            <input type="text" name="id"  placeholder="请输入用户id">
          </div>
          <div>
            <input type="password" name="password"   placeholder="请输入密码">
          </div>
          <div>
            <div>
              <button type="submit">登录</button>
            </div>
          </div>
        </s:form>
      </div><!-- /.form-box -->
</div>
</BODY>

</HTML>
