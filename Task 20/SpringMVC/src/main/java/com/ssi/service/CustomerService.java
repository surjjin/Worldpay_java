package com.ssi.service;

import java.util.HashMap;
import java.util.List;

import com.ssi.entity.Customer;

public interface CustomerService {

	public Customer saveCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer getCustomerById(String code);
	public List<Customer> getAllCustomers();
	public Customer delete(String code);
}
