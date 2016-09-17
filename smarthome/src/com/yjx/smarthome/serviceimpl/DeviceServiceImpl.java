package com.yjx.smarthome.serviceimpl;

import java.util.List;
import java.util.Map;

import com.yjx.smarthome.dao.BaseDao;
import com.yjx.smarthome.service.BaseService;
/**
 *  由于各个实体类的create（）方法有不同的业务逻辑（例如创建用户前需要检查账号是否已经存在），
 *  所以把类定义成abstract
 * 把create（）方法定义成abstract，由具体的Service单独实现
 * 
 * @author XieYingjie
 *
 * @param <T>
 */
public  class  DeviceServiceImpl<T> implements BaseService<T>{
	/**
     * 通过spring的IoC注射进来
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
