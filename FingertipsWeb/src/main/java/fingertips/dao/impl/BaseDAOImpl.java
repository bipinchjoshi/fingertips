package fingertips.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import fingertips.dao.BaseDAO;

public class BaseDAOImpl<E, ID extends Serializable> implements BaseDAO<E, ID> {

	@Autowired
	protected SessionFactory sessionFactory;

	public void saveOrUpdate(E entity) {

		sessionFactory.getCurrentSession().saveOrUpdate(entity);

	}
	
	@SuppressWarnings("unchecked")
	public ID save(E entity) {

		return (ID) sessionFactory.getCurrentSession().save(entity);

	}

	public void merge(E entity) {
		sessionFactory.getCurrentSession().merge(entity);

	}

	public void delete(E entity) {
		sessionFactory.getCurrentSession().delete(entity);
		

	}

	@SuppressWarnings("unchecked")
	public List<E> findMany(Query query) {
		List<E> t;
		t = (List<E>) query.list();
		return t;

	}

	@SuppressWarnings("unchecked")
	public E findOne(Query query) {
	
		E t;
		t = (E) query.uniqueResult();
		return t;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List<E> findAll( Class clazz) {
		List<E> objects = null;
        	Criteria criteria = getCriteria(clazz);
        	objects = (List<E>)criteria.list();
        return objects;
	}

	@SuppressWarnings({"unchecked" , "rawtypes"})
	public E findByID( Class clazz, Serializable ID) {
		E e = null;
		e = (E) sessionFactory.getCurrentSession().get(clazz, ID);
		return e;
	}

	@SuppressWarnings("rawtypes")
	public Criteria getCriteria( Class clazz) {
	return sessionFactory.getCurrentSession().createCriteria(clazz);
	}

	@SuppressWarnings("rawtypes")
	public Criteria getCriteria( Class clazz, String alias) {
		return sessionFactory.getCurrentSession().createCriteria(clazz, alias);
		}

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}
}
