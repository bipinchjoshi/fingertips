package fingertips.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public interface BaseDAO<E, ID extends Serializable> {

	public void saveOrUpdate(E entity);
	
	public ID save(E entity);

	public void merge(E entity);

	public void delete(E entity);

	public List<E> findMany(Query query);

	public E findOne(Query query);

	@SuppressWarnings("rawtypes")
	public List findAll(Class clazz);

	/**
	 * 
	 * @param clazz
	 * @param ID
	 * @return Entity associated with the 
	 */
	
	@SuppressWarnings("rawtypes")
	public E findByID(Class clazz, Serializable ID);

	
	/**
	 * 
	 * @param clazz
	 * @return Criteria
	 */
	@SuppressWarnings("rawtypes")
	public Criteria getCriteria(Class clazz);

	/**
	 * @param clazz
	 * @param name
	 * @return Criteria associated with alias 
	 */
	@SuppressWarnings("rawtypes")
	public Criteria getCriteria(Class clazz, String name);
	
	public SessionFactory getSessionFactory() ;

	public void setSessionFactory(SessionFactory sessionFactory);
}
