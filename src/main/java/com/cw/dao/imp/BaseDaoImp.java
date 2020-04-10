package com.cw.dao.imp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cw.dao.BaseDao;
@Repository
public abstract  class BaseDaoImp<T> implements BaseDao<T> {
	
	@Resource
	SessionFactory sessionFactory;
	protected Class<T> clazz;
	
	public BaseDaoImp() {
		ParameterizedType pt= (ParameterizedType) this.getClass().getGenericSuperclass();
		clazz=(Class) pt.getActualTypeArguments()[0];
		System.out.println("======clazz===="+clazz);
	}

	@Override
	public void save(T entity) {
		getSession().save(entity);
		
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
		
	}

	@Override
	public void saveOrUpdate(T entity) {
		getSession().saveOrUpdate(entity);
		
	}

	public void delete(String id) {
		Object obj=getSession().get(clazz, id);
		Session session=sessionFactory.openSession();
	      session.beginTransaction();
	      if (null != obj) {
	          session.delete(obj);
	      }
	      session.getTransaction().commit();
	      session.close();
	}

	@Override
	public T findByid(String id) {
		// TODO Auto-generated method stub
		return (T) getSession().get(clazz, id);
	}

	@Override
	public List<T> findAll() {
		return getSession().createCriteria(clazz).list();
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public List<T> findByids(String[] ids) {
		getSession().createCriteria(clazz).add(Restrictions.in("id", ids));
		return null;
	}

}
