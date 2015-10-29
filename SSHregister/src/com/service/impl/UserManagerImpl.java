package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dao.UserDao;
import com.model.User;
import com.service.UserManager;

@Component("userManager")
public class UserManagerImpl implements UserManager {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}
	
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/* (non-Javadoc)
	 * @see com.service.impl.UserManager#exists(com.model.User)
	 */
	public boolean exists(User u) throws Exception {
		return userDao.checkUserExistsWithId(u.getId());
		
	}
	
	/* (non-Javadoc)
	 * @see com.impl.UserManager#add(com.model.User)
	 */
	public void add(User u) throws Exception {
		userDao.save(u);
	}
}
