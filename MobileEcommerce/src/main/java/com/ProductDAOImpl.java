package com;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired  
	private SessionFactory sessionFactory;

	@Override
	public int insertRow(Product product) {
		sessionFactory.getCurrentSession().save(product);
		sessionFactory.getCurrentSession().flush();
		return 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getList() {

		return (List<Product>) sessionFactory.getCurrentSession().createQuery("from Product").list();  
	}

	@Override
	public Product getRowById(int id) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, id);  
	}

	@Override
	public int updateRow(Product product) {
		System.out.println(product.getPrdID());
		sessionFactory.getCurrentSession().update(product);
		sessionFactory.getCurrentSession().flush();
		return 0;
	}

	@Override
	public int deleteRow(int id) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Product WHERE prdid = "+ id).executeUpdate(); 
		return 0;
	} 
}
