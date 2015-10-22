<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="GB18030"%>
<%@ page import="com.model.*" %>
<%@ page import="com.service.*" %>
<%@ page import="com.service.Impl.*" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

	String id = request.getParameter("id");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String password2 = request.getParameter("password2");

	User u = new User();
	u.setId(id);
	u.setUsername(username);
	u.setPassword(password);
	
	UserManager um = new UserManagerImpl();
	
	boolean exists = um.exists(u);
	if(exists) {
		response.sendRedirect("registerFail.jsp");
		return;
	}
	
	um.add(u);
	response.sendRedirect("registerSuccess.jsp");
%>