package com.dao;

import com.model.User;

public interface UserDao {
	public void save(User u);
	public boolean checkUserExistsWithId(String id);  
}