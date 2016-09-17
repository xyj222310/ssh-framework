package com.yjx.smarthome.daoimpl;

import com.yjx.smarthome.dao.UserDao;
import com.yjx.smarthome.moudel.User;
public  class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
	//这么写的原因：继承basedao可以使用通用dao方法，
	//而实现userdao，userdao类里面可以写一些专用的dao方法，在此实现
	
}
