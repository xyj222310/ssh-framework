package com.yjx.smarthome.daoimpl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.yjx.smarthome.dao.BaseDao;
@SuppressWarnings("unchecked")
public class BaseDaoImpl<T> implements BaseDao<T> {
	private SessionFactory  sessionFactory = null;
    @Override
    public T findById(Class<T> clazz, int id) {
        // TODO Auto-generated method stub
        return (T) getSession().get(clazz, id);
    }

    @Override
    public void create(T t) {
        // TODO Auto-generated method stub
        getSession().persist(t);
    }

    @Override
    public void save(T t) {
        // TODO Auto-generated method stub
        getSession().saveOrUpdate(t);
    }

    @Override
    public void delete(T t) {
        // TODO Auto-generated method stub
        getSession().delete(t);
    }

    @Override
    //根据hql查询实体
    public List<T> list(String hql, Map<String, Object> map) {
        // TODO Auto-generated method stub
        Query query = getQuery(hql, map);
        List<T> list = query.list();
        return list;
    }

    @Override
    public int getTotalCount(String hql, Map<String, Object> map) {
        // TODO Auto-generated method stub
        Query query = getQuery(hql, map);
        System.out.println("hql"+hql);
        Object obj = query.uniqueResult();
        return ((Long) obj).intValue();
    }

    @Override
    //分页查询实现
    public List<T> list(String hql, int firstResult, int maxResults,
            Map<String, Object> map) {
        // TODO Auto-generated method stub
        Query query = getQuery(hql, map);
        List<T> list = query.setFirstResult(firstResult)
                .setMaxResults(maxResults).list();
        System.out.println("起始:"+firstResult);
        System.out.println("最大值:"+maxResults);
        System.out.println("实际值:"+list.size());
        return list;
    }
    @Override
    public Query getQuery(String hql, Map<String, Object> map) {
        Query query = getSession().createQuery(hql);
        // TODO Auto-generated method stub
        if (map != null) {  
            Set<String> keySet = map.keySet();  
            for (String string : keySet) {  
                Object obj = map.get(string);  
                //这里考虑传入的参数是什么类型，不同类型使用的方法不同  
                if(obj instanceof Collection<?>){  
                    query.setParameterList(string, (Collection<?>)obj);  
                }else if(obj instanceof Object[]){  
                    query.setParameterList(string, (Object[])obj);  
                }else{  
                    query.setParameter(string, obj);  
                }  
            }  
        }  
        return query;  
    }
    
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
