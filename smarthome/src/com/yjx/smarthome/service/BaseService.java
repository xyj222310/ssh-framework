package com.yjx.smarthome.service;

import java.util.List;
import java.util.Map;

import com.yjx.smarthome.dao.BaseDao;
/**
 * ������ӿڲ�����Ϊbean��applicationContext.xml�У���ΪserviceImpl���麯��
 * @author XieYingjie
 *
 * @param <T>
 */
public interface  BaseService<T> {
	
	/**
     * ����id�Ͷ��������ʵ��
     */
    public T findById(Class<T> clazz, int id);

    /**
     * ����ʵ��
     */
    public void create(T t);

    /**
     * ����ʵ��
     */
    public void save(T t);

    /**
     * ɾ��ʵ��
     */
    public void delete(T t);

    /**
     * ��ҳʵ��
     */
    public List<T> list(String hql, int firstResult, int maxResults,
            Map<String, Object> map);

    int getTotalCount(String hql, Map<String, Object> map);

    public List<T> list(String hql, Map<String, Object> map);

    public  List<T> listPage(String hql, int page, int maxResults,
            Map<String, Object> map);
}
