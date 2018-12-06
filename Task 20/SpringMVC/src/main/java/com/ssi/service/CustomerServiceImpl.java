package com.ssi.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssi.dao.CustomerDAO;
import com.ssi.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDAO.saveCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerDAO.updateCustomer(customer);
	}

	@Override
	public Customer getCustomerById(String code) {
		return customerDAO.getCustomerById(code);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	@Override
	public Customer delete(String code) {
		return customerDAO.delete(code);
	}

}
