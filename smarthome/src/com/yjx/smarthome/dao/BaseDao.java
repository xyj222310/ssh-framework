package com.yjx.smarthome.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;

public interface BaseDao<T> {
	/**
     * ����id����ʵ��
     * 
     * @param clazz
     * @param id
     * @return
     */
    public T findById(Class<T> clazz, int id);

    public void create(T t);

    public void save(T t);

    public void delete(T t);
    /**
     * ��ѯʵ��
     * @param hql
     * @param map
     * @return
     */
    public List<T> list(String hql, Map<String, Object> map);
   
//    public List<T> findByHQL(String hql, Object... params);
  
    /**
     * ��ѯĳҳʵ��
     * @param hql ��ѯ���
     * @param firstResult �ӵڼ�����ʼ��ע��������0��ʼ
     * @param maxResults ��෵�ص���������
     * @param map ������ֵ��
     * @return
     */
    public List<T> list(String hql, int firstResult, int maxResults,
            Map<String, Object> map);

    public Query getQuery(String hql, Map<String, Object> map);

    /**
     * ��ȡ��¼����
     * @param hql
     * @param map
     * @return
     */
    int getTotalCount(String hql, Map<String, Object> map);
}
