package com.ssi.services;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.ProductDao;
import com.ssi.entities.Product;
@Service
public class ProductServiceImplementaion implements ProductInterface{

	@Autowired
	ProductDao pd;
	
	@Override
	public Product searchProduct(int pcode) {
		return pd.searchProduct(pcode);
	}

	@Override
	public List<Product> searchallProduct() {
		return pd.searchallProduct();
	}

	@Override
	public Product insertProduct(Product p) {
		return pd.insertProduct(p);
	}

	@Override
	public Product updateProduct(Product p) {
		// TODO Auto-generated method stub
		return pd.updateProduct(p);
	}

	@Override
	public Product deleteProduct(Product p) {
		// TODO Auto-generated method stub
		return pd.deleteProduct(p);
	}

	@Override
	public HashMap<String, String> getAllCustomerInfo() {
		// TODO Auto-generated method stub
		return pd.getAllCustomerInfo();
	}

	@Override
	public Set<String> getAllPcode() {
		// TODO Auto-generated method stub
		return pd.getAllPcode();
	}

}
