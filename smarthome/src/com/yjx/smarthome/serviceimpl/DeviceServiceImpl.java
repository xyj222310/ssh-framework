package com.yjx.smarthome.serviceimpl;

import java.util.List;
import java.util.Map;

import com.yjx.smarthome.dao.BaseDao;
import com.yjx.smarthome.service.BaseService;
/**
 *  ���ڸ���ʵ�����create���������в�ͬ��ҵ���߼������紴���û�ǰ��Ҫ����˺��Ƿ��Ѿ����ڣ���
 *  ���԰��ඨ���abstract
 * ��create�������������abstract���ɾ����Service����ʵ��
 * 
 * @author XieYingjie
 *
 * @param <T>
 */
public  class  DeviceServiceImpl<T> implements BaseService<T>{
	/**
     * ͨ��spring��IoCע�����
     */
    protected BaseDao<T> dao; 
    
    public BaseDao<T> getDao() {
        return dao;
    }

    public void setDao(BaseDao<T> dao) {
        this.dao = dao;
    }

    @Override
    public T findById(Class<T> clazz, int id) {
        // TODO Auto-generated method stub
        return dao.findById(clazz, id);
    }
    
    @Override
    public void create(T t){
        dao.create(t);
    };
    
    @Override
    public void save(T t) {
        // TODO Auto-generated method stub
        dao.save(t);
    }

    @Override
    public void delete(T t) {
        // TODO Auto-generated method stub
        dao.delete(t);
    }

    @Override
    public List<T> list(String hql, Map<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.list(hql, map);
    }
    
    @Override
    public int getTotalCount(String hql, Map<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.getTotalCount(hql, map);
    }

    @Override
    public List<T> list(String hql, int firstResult, int maxResults,
            Map<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.list(hql, firstResult, maxResults, map);
    }

    @Override
    public List<T> listPage(String hql, int page, int maxResults,
            Map<String, Object> map) {
        // TODO Auto-generated method stub
        return dao.list(hql, maxResults*(page-1), maxResults, map);
    }
}
