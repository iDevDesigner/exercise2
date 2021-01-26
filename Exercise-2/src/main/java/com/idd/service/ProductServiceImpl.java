package com.idd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idd.dao.ProductDAO;
import com.idd.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	// inject product dao
	@Autowired
	private ProductDAO customerDAO;

	@Override
	@Transactional
	public List<Product> getProducts() {
		return customerDAO.getProducts();
	}

	@Override
	@Transactional
	public Product getProduct(int theId) {

		return customerDAO.getProduct(theId);
	}

	@Override
	@Transactional
	public void deleteProduct(int theId) {

		customerDAO.deleteProduct(theId);
	}
}
