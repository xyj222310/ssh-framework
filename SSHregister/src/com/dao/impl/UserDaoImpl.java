package com.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.dao.UserDao;
import com.model.User;

@Component("userDao")
public class UserDaoImpl implements UserDao {
	
	private HibernateTemplate hibernateTemplate; 
	public void save(User u) {
		hibernateTemplate.save(u);
		
	}

	public boolean checkUserExistsWithId(String id) {
		List<User> users = hibernateTemplate.find("from User u where u.id = '" + id + "'");
		
		
		if(users != null && users.size() > 0) {
			return true;
		}
		return false;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
