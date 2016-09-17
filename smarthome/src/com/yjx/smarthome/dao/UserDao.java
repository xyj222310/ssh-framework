package com.yjx.smarthome.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

import com.yjx.smarthome.moudel.User;

public interface UserDao extends BaseDao<User>{
	//这里应该写一些userdao层专用的方法声明。不必写basedao的方法，因为实现本接口的类是继承basedaoimpl的
	
}
