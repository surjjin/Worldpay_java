package com.ssi.services;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.ssi.entities.Product;

public interface ProductInterface {
	public Product searchProduct(int pcode);
	public List<Product> searchallProduct();
	public Product insertProduct(Product p);
	public Product updateProduct(Product p);
	public Product deleteProduct(Product p);
	public HashMap<String,String>getAllCustomerInfo();
	public Set<String> getAllPcode();
}


