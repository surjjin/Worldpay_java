package com.ssi.dao;

import java.util.List;

import com.ssi.entity.Product;

public interface ProductDAO {

	public Product saveProduct(Product product);
	public Product updateProduct(Product product);
	public Product deleteProduct(String pcode);
	public Product getProductById(String pcode);
	public List<Product> getAllProducts();
	public List<String> getAllProductCode();
	
}
