package com.idd.dao;

import java.util.List;

import com.idd.entity.Product;

public interface ProductDAO {

	public List<Product> getProducts();

	public Product getProduct(int theId);

	public void deleteProduct(int theId);

}
