<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Register Page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<div id="jkout">
  		<div id="jkin">
  			<div id="jk_head">用胡注册信息：</div>
  			<div id="jkcontent">
  				<form method="post" action="user.action">
  					<table cellpadding="0"cellspacing="1"width="50%"align="center">
  					<tr>
  						<td>用胡id:</td>
  						<td><input type="text" name="id"></td>
  					</tr>
  					<tr>
  						<td>用胡名字:</td>
  						<td><input type="text" name="username"></td>
  					</tr>
  					<tr>
  						<td>密码:</td>
  						<td><input type="password" name="password"></td>
  					</tr>
  					<tr>
  						<td>再次确认密码:</td>
  						<td><input type="password" name="password2"></td>
  					</tr>
  					<tr>
  						<td></td>
  						<td><input type="submit" value="提交"></td>
  					</tr>
  					</table>
  				</form>
  			</div>
  		</div>
  	</div>
    <br>
  </body>
</html>
