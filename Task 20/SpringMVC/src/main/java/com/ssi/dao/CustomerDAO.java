package com.ssi.dao;

import java.util.List;

import com.ssi.entity.Customer;

public interface CustomerDAO {

	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(String code);
	public List<Customer> getAllCustomers();
	public Customer delete(String code);
	
}
