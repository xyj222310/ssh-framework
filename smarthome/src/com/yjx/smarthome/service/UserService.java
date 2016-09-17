package com.yjx.smarthome.service;

import com.yjx.smarthome.moudel.User;
/**
 * 这个父接口不能作为bean在applicationContext.xml中，因为serviceImpl是虚函数
 * @author XieYingjie
 *
 * @param <T>
 */
public interface UserService  extends  BaseService<User>{
	//这里应该写一些userservice层专用的方法声明。不必写baseservice的方法，
	//因为实现本接口的类是继承baseserviceimpl的
	
}