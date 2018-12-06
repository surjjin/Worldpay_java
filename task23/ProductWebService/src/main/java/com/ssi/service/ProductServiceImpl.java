package com.ssi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ssi.entity.Product;
import com.ssi.dao.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductDAO productDAO;
	
	public Product saveProduct(Product product) {
		return productDAO.saveProduct(product);
	}

	public Product updateProduct(Product product) {
		return productDAO.updateProduct(product);
	}

	public Product deleteProduct(String pcode) {
		return productDAO.deleteProduct(pcode);
	}

	public Product getProductById(String pcode) {
		return productDAO.getProductById(pcode);
	}

	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}

	public List<String> getAllProductCode() {
		return productDAO.getAllProductCode();
	}

}
