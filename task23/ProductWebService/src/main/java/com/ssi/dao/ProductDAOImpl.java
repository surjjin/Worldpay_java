package com.ssi.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public Product saveProduct(Product product) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(product);
		transaction.commit();
		session.close();
		return product;
	}

	public Product updateProduct(Product product) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(product);
		transaction.commit();
		session.close();
		return product;
	}

	public Product deleteProduct(String pcode) {
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Product product=new Product(pcode);
		session.delete(product);
		transaction.commit();
		session.close();
		return product;
	}

	public Product getProductById(String pcode) {
		Session session=sessionFactory.openSession();
		Product product=session.get(Product.class, pcode);
		session.close();
		return product;
	}

	public List<Product> getAllProducts() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product> productList=query.list();
		return productList;

	}

	public List<String> getAllProductCode() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("select pcode from Product");
		List<String> productList=query.list();
		return productList;
	}
}
