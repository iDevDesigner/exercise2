package com.idd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.idd.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	//inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getProducts() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Product> theQuery = currentSession.createQuery("from Product order by price DESC", Product.class);

		// execute query and get result list
		List<Product> products = theQuery.getResultList();

		// return the results
		return products;
	}

	@Override
	public Product getProduct(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Product theProduct = currentSession.get(Product.class, theId);

		return theProduct;
	}

	@Override
	public void deleteProduct(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Product where id=:prodId");
		theQuery.setParameter("prodId", theId);

		theQuery.executeUpdate();
	}

}
