package com.dao.Impl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dao.UserDao;
import com.model.User;
import com.util.HibernateSessionFactory;

public class UserDaoImpl implements UserDao{

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateSessionFactory.getSessionFactory();
    	Session s =sf.openSession();
		s.beginTransaction();		
        s.save(u);
        s.getTransaction().commit();
	}

	@Override
	public boolean checkUserExistsWithId(String id) {
		// TODO Auto-generated method stub
		SessionFactory sf = HibernateSessionFactory.getSessionFactory();
    	Session s =sf.openSession();	
        s.beginTransaction();
        Long count = (Long) s.createQuery("select count(*) from User u where u.id = :id")
				.setString("id", id)
				.uniqueResult();
        s.getTransaction().commit();
        if(count > 0) {
			return true;
		}
		return false;
	}
	
}
