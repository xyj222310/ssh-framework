package com.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserManager;

public class UserAction extends ActionSupport {
	private String id;
	private String username;
	private String password;
	private String password2;
	
	private UserManager um;
	
	public UserAction() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		um = (UserManager)ctx.getBean("userManager");
	}
	
	public UserManager getUm() {
		return um;
	}

	public void setUm(UserManager um) {
		this.um = um;
	}

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setUsername(username);
		u.setId(id);
		u.setPassword(password);
		if(um.exists(u)) {
			return "fail";
		}
		um.add(u);
		return "success";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
