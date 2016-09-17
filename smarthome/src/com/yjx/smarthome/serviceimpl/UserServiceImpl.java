package com.yjx.smarthome.serviceimpl;

import com.yjx.smarthome.dao.BaseDao;
import com.yjx.smarthome.moudel.User;
import com.yjx.smarthome.service.UserService;

/**
 *  由于各个实体类的create（）方法有不同的业务逻辑（例如创建用户前需要检查账号是否已经存在），
 *  所以把类定义成abstract
 * 把create（）方法定义成abstract，由具体的Service单独实现
 * 但是觉得这样不好，所以每个service和dao 具体实现不同的功能就分开写，并且继承baseimpl 
 * @author XieYingjie
 * @param <User>
 */
public  class  UserServiceImpl extends BaseServiceImpl<User> implements UserService{

	@Override
	public BaseDao<User> getDao() {
		// TODO Auto-generated method stub
		return super.getDao();
	}

	@Override
	public void setDao(BaseDao<User> dao) {
		// TODO Auto-generated method stub
		super.setDao(dao);
	}

	@Override
	public User findById(Class<User> clazz, int id) {
		// TODO Auto-generated method stub
		return super.findById(clazz, id);
	}

	@Override
	public void create(User t) {
		// TODO Auto-generated method stub
		super.create(t);
	}

	@Override
	public void save(User t) {
		// TODO Auto-generated method stub
		super.save(t);
	}

	@Override
	public void delete(User t) {
		// TODO Auto-generated method stub
		super.delete(t);
	}
	
	
}