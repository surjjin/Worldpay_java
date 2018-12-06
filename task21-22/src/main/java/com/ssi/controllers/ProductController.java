package com.ssi.controllers;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.jws.WebParam.Mode;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.jasper.tagplugins.jstl.core.Set;
import org.hibernate.engine.jdbc.BlobProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Product;
import com.ssi.services.ProductServiceImplementaion;

@Controller
public class ProductController {
	@Autowired
	ProductServiceImplementaion ps;

	@GetMapping("addproduct")
	public ModelAndView showProductEntryForm() {
		ModelAndView mv=new ModelAndView("entry.jsp");
		Product product =new Product();
		
		ArrayList<String> brandlist=new ArrayList<>();
		brandlist.add("apple");
		brandlist.add("google");
		brandlist.add("oppo");
		
		ArrayList<String> specslist=new ArrayList<>();
		specslist.add("camera");
		specslist.add("dual camera");
		specslist.add("flash light");
		mv.addObject("product", product);
		mv.addObject("brandlist",brandlist);
		mv.addObject("specslist", specslist);
		System.out.println(brandlist);
		System.out.println(specslist);
		return mv;
		
	}
	@PostMapping("addproduct")
	//@GetMapping("practice")
	public ModelAndView confirmAddProduct(@Valid @ModelAttribute("product") Product product,BindingResult result,@RequestParam("fp")MultipartFile file1,@RequestParam("sp")MultipartFile file2) {
		
		if(result.getErrorCount()>1) {
			ModelAndView mv=new ModelAndView("entry.jsp");
			//Product product =new Product();
			
			ArrayList<String> brandlist=new ArrayList<>();
			brandlist.add("apple");
			brandlist.add("google");
			brandlist.add("oppo");
			
			ArrayList<String> specslist=new ArrayList<>();
			specslist.add("camera");
			specslist.add("dual camera");
			specslist.add("flash light");
			mv.addObject("product", product);
			mv.addObject("brandlist",brandlist);
			mv.addObject("specslist", specslist);
			System.out.println(brandlist);
			System.out.println(specslist);
			return mv;
		}
		else {
			byte[] b1=null;
			byte[] b2 =null;
			try {
				 b1 = file1.getBytes();
				 b2= file2.getBytes();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(b1);
			System.out.println(b2);
			Blob pic1 = BlobProxy.generateProxy(b1);
			Blob pic2 = BlobProxy.generateProxy(b2);
			System.out.println(pic1);
			System.out.println(pic2);
			
			product.setPic1(pic1);
			product.setPic2(pic2);
			System.out.println(product);
			ps.insertProduct(product);
			ModelAndView mv=new ModelAndView("confirm.jsp");
			return mv;
		}
	}
	
	@GetMapping("searchproduct")
	public ModelAndView searchPage() {
		java.util.Set<String> allPcode = ps.getAllPcode();
		//Iterator<String> iterator = allPcode.iterator();
		ArrayList<Integer> n=new ArrayList<>();
		for(String s:allPcode) {
			n.add(Integer.parseInt(s));
		}
		//System.out.println(allPcode);
		//List<String> allpcode = new ArrayList<>();
		//allpcode.add("101");
		System.out.println(n);
		ModelAndView mv=new ModelAndView("searchpage.jsp");
		System.out.println(1);
		mv.addObject("pcodeList", n);
		mv.addObject("list", allPcode);
		Product product = new Product();
		mv.addObject("product",product);
		System.out.println(2);
		return mv;
		
	}
	
	@PostMapping("searchproduct")
	public ModelAndView displayProduct(@RequestParam("pcode") int pcode,@ModelAttribute("product") Product product) {
		product = ps.searchProduct(pcode);
		ModelAndView mv=new ModelAndView("displayProduct.jsp");
		mv.addObject("product", product);
		return mv;
	}
	
	
	@GetMapping("viewallproducts")
	public ModelAndView displayAllProduct() {
		List<Product> products = ps.searchallProduct();
		ModelAndView mv=new ModelAndView("displayallProduct.jsp");
		mv.addObject("products", products);
		return mv;
	}
	
	@GetMapping("removeproduct")
	public ModelAndView removeProduct(@RequestParam("pcode") int pcode) {
		Product product = ps.searchProduct(pcode);
		ps.deleteProduct(product);
		return displayAllProduct();
		
	}
	
	@GetMapping("imagefirstdisplay")
	public void showFirstImage(@RequestParam("pcode") int pcode,HttpServletResponse response) throws IOException {
		Product product = ps.searchProduct(pcode);
		response.setContentType("image/*");
		Blob pic1 = product.getPic1();
		byte b[] = null;
		try {
			b=pic1.getBytes(1, (int) pic1.length());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ServletOutputStream out = response.getOutputStream();
		out.write(b);
		out.close();
	}
	
	@GetMapping("imageseconddisplay")
	public void showSecondImage(@RequestParam("pcode") int pcode,HttpServletResponse response) throws IOException {
		Product product = ps.searchProduct(pcode);
		response.setContentType("image/*");
		Blob pic2 = product.getPic2();
		byte b[] = null;
		try {
			b=pic2.getBytes(1, (int) pic2.length());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ServletOutputStream out = response.getOutputStream();
		out.write(b);
		out.close();
	}
	
	
}
