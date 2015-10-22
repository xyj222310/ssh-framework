package com.action;

import com.model.User;
import com.service.UserManager;
import com.service.Impl.UserManagerImpl;

public class UserAction {
	private String id;
	private String username;
	private String password;
	private String password2;
	public String getUsername() {
		return username;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	UserManager um = new UserManagerImpl();

	
	public UserManager getUm() {
		return um;
	}
	public void setUm(UserManager um) {
		this.um = um;
	}


	public String execute() throws Exception{
		User u= new User();
		u.setId(id);
		u.setUsername(username);
		u.setPassword(password);
		if(um.exists(u)){
			System.out.print("ssssjfldjfldjfldjfdlfjlnfsdfd");

			return "fail";
			
		}
		um.add(u);
		return "success";
	}
}
