package com.idd.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idd.entity.Product;
import com.idd.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {

	// autowired the CustomerService
	@Autowired
	private ProductService productService;

	// add mapping for GET /products
	@GetMapping("/products")
	public List<Product> getCustomers() {

		return productService.getProducts();

	}

	// add mapping for GET /products/{produtId}

	@GetMapping("/products/{produtId}")
	public Product getCustomer(@PathVariable int produtId) {

		Product theProduct = productService.getProduct(produtId);

		return theProduct;
	}

	// add mapping for DELETE /products/{produtId} - delete product

	@DeleteMapping("/products/{produtId}")
	public String deleteCustomer(@PathVariable int produtId) {

		Product tempProd = productService.getProduct(produtId);

		// Handling null condition

		if (tempProd == null) {
			return "Product with id - " + produtId + " Not found";

		} else {
			productService.deleteProduct(produtId);
			return "Deleted customer id - " + produtId;

		}
	}

}
