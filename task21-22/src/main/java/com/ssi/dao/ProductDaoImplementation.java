package com.ssi.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entities.Product;
@Repository
public class ProductDaoImplementation implements ProductDao{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Product searchProduct(int pcode) {
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, pcode);
		session.close();
		return product;
	}

	@Override
	public List<Product> searchallProduct() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product");
		List<Product> l=query.list();
		session.close();
		return l;
	}

	@Override
	public Product insertProduct(Product p) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(p);
		transaction.commit();
		session.close();
		return p;
	}

	@Override
	public Product updateProduct(Product p) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(p);
		transaction.commit();
		session.close();
		return p;
		
	}

	@Override
	public Product deleteProduct(Product p) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(p);
		transaction.commit();
		session.close();
		return p;
		
	}

	@Override
	public HashMap<String, String> getAllCustomerInfo() {
		//Session session = sessionFactory.openSession();
		List<Product> list = searchallProduct();
		HashMap<String, String > hm=new HashMap<>();
		for(Product p:list) {
			hm.put(p.getPcode()+"", p.getPname());
		}
		return hm;
	}

	@Override
	public Set<String> getAllPcode() {
		HashMap<String,String> hashMap = getAllCustomerInfo();
		Set<String> keySet = hashMap.keySet();
		return keySet;
		
	}

}
