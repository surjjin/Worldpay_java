package com.ssi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssi.entity.Product;
import com.ssi.service.ProductService;

@Controller
@RequestMapping("productRestAPI")
public class ProductController {

	@Autowired
	ProductService productService;

	
	// -- REST PART START --
	
	@GetMapping(value="{pcode}",produces="application/json")
	@ResponseBody
	public Product getProduct(@PathVariable("pcode") String pcode){
		return productService.getProductById(pcode);
	}
	
	@ResponseBody
	@GetMapping
	public String getAllProducts(){
		return productService.getAllProducts().toString();
	}
	
	@GetMapping(value="/json",produces="application/json")
	@ResponseBody
	public List<Product> getAllJSON(){
		return productService.getAllProducts();
	}
	
	@GetMapping(value="/xml",produces="application/xml")
	@ResponseBody
	public List<Product> getAllXML(){
		return productService.getAllProducts();
	}
	
	@PostMapping(consumes="application/json",produces="application/json")
	@ResponseBody
	public Product addProduct(@RequestBody Product product){
		return productService.saveProduct(product);
	}
	
	@PutMapping(consumes="application/json",produces="application/json")
	@ResponseBody
	public Product modifyProduct(@RequestBody Product product){
		return productService.updateProduct(product);
	}
	
	@DeleteMapping(value="{pcode}",produces="application/json")
	@ResponseBody
	public Product removeProduct(@PathVariable("pcode") String pcode){
		return productService.deleteProduct(pcode);
	}

	// -- REST PART END --
	
		
}
