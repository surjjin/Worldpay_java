package com.ssi.entities;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class Product {
	@Id
	//@Length(min=3)
	private int pcode;
	
	private String brand;
	
	@Pattern(regexp="[a-z]*")
	private String pname;
	@Min(100)
	private int price;
	private String specs;
	private Blob pic1;
	private Blob pic2;
	
	public String getSpecs() {
		return specs;
	}
	public void setSpecs(String specs) {
		this.specs = specs;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Blob getPic1() {
		return pic1;
	}
	public void setPic1(Blob pic1) {
		this.pic1 = pic1;
	}
	public Blob getPic2() {
		return pic2;
	}
	public void setPic2(Blob pic2) {
		this.pic2 = pic2;
	}

	public Product(int pcode, String brand, String pname, int price, String specs, Blob pic1, Blob pic2) {
		super();
		this.pcode = pcode;
		this.brand = brand;
		this.pname = pname;
		this.price = price;
		this.specs = specs;
		this.pic1 = pic1;
		this.pic2 = pic2;
	}
	public Product(int pcode) {
		super();
		this.pcode = pcode;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", brand=" + brand + ", pname=" + pname + ", price=" + price + ", specs="
				+ specs + ", pic1=" + pic1 + ", pic2=" + pic2 + "]";
	}
	
	
		
}
