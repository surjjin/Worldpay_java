package com.ssi.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssi.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Customer saveCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(customer);
		tr.commit();
		session.close();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		session.update(customer);
		tr.commit();
		session.close();
		return customer;
	}

	@Override
	public Customer getCustomerById(String code) {
		Session session=sessionFactory.openSession();
		Customer customer=session.get(Customer.class, code);
		session.close();
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer");
		List<Customer> customerList=query.list();
		return customerList;
	}

	@Override
	public Customer delete(String code) {
		Session session=sessionFactory.openSession();
		Transaction tr=session.beginTransaction();
		Customer customer=new Customer(code);
		session.delete(customer);
		tr.commit();
		session.close();
		return customer;
	}

}
