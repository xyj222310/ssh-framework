package com.service.Impl;

import com.dao.UserDao;
import com.dao.Impl.UserDaoImpl;
import com.model.User;
import com.service.UserManager;

public class UserManagerImpl implements UserManager {
	private UserDao userDao = new UserDaoImpl();

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	/* (non-Javadoc)
	 * @see com.service.Impl.UserManager#exists(com.model.User)
	 */
	@Override
	public boolean exists(User u) throws Exception {
		return userDao.checkUserExistsWithId(u.getId());
	}
	

	/* (non-Javadoc)
	 * @see com.service.Impl.UserManager#add(com.model.User)
	 */
	@Override
	public void add(User u) throws Exception {				
		userDao.save(u);
	}
}
