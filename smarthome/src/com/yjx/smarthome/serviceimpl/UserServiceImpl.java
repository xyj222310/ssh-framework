package com.yjx.smarthome.serviceimpl;

import com.yjx.smarthome.dao.BaseDao;
import com.yjx.smarthome.moudel.User;
import com.yjx.smarthome.service.UserService;

/**
 *  ���ڸ���ʵ�����create���������в�ͬ��ҵ���߼������紴���û�ǰ��Ҫ����˺��Ƿ��Ѿ����ڣ���
 *  ���԰��ඨ���abstract
 * ��create�������������abstract���ɾ����Service����ʵ��
 * ���Ǿ����������ã�����ÿ��service��dao ����ʵ�ֲ�ͬ�Ĺ��ܾͷֿ�д�����Ҽ̳�baseimpl 
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