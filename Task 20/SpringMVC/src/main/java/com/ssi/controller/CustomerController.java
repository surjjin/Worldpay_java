package com.ssi.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entity.Customer;
import com.ssi.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("newcustomer")
	public String showCustomerEntryForm(){
		return "customerentry.jsp";
	}
	
	@GetMapping("searchcustomer")
	public String showCustomerSearchForm(){
		return "customersearch.jsp";
	}
	
	@GetMapping("viewallcustomers")
	public ModelAndView showAllCustomersList(){
		List<Customer> customerList=customerService.getAllCustomers();
		ModelAndView mv=new ModelAndView("customerslist.jsp");
		mv.addObject("customerslist", customerList);
		return mv;
	}
	
	@PostMapping("savecustomer")
	public ModelAndView processEntryForm(@ModelAttribute("customer") Customer customer){
		customerService.saveCustomer(customer);
		ModelAndView mv=new ModelAndView("confirm.jsp");
		return mv;
	}
	
	@PostMapping("savechanges")
	public ModelAndView saveChanges(@ModelAttribute("customer") Customer customer){
		customerService.updateCustomer(customer);
		ModelAndView mv=new ModelAndView("confirm.jsp");
		return mv;
	}
	
	@PostMapping("showcustomerdetails")
	public ModelAndView processSearchForm(@RequestParam("code") String code){
		Customer customer=customerService.getCustomerById(code);
		ModelAndView mv=new ModelAndView("customerdetails.jsp");
		mv.addObject("customer", customer);
		return mv;
	}
	
	@GetMapping("updatecustomer")
	public ModelAndView showUpdateForm(@RequestParam("code") String code){
		ModelAndView mv=new ModelAndView("customerupdate.jsp");
		Customer customer=customerService.getCustomerById(code);
		mv.addObject("customer", customer);
		return mv;
	}
	@GetMapping("deletecustomer")
	public ModelAndView removeCustomer(@RequestParam("code") String code){
		Customer customer=customerService.delete(code);
		ModelAndView mv=new ModelAndView("viewallcustomers");
		return mv;
	}

}








