/*
package com.ssi.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Entity
public class Product {

	@Id
	private String pcode;
	@Pattern(regexp="[a-z]*")
	private String pname;
	private String availability; //checkbox - cod, credit, debit
	@Min(1)
	private int price;
	private String category; //dropdown - electronics, fashion, automobiles
	private String made;	//radio - imported, local
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	public Product(String pcode, @Pattern(regexp = "[a-z]*") String pname, String availability, @Min(1) int price,
			String category, String made) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.availability = availability;
		this.price = price;
		this.category = category;
		this.made = made;
	}
	public Product(String pcode) {
		super();
		this.pcode = pcode;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", availability=" + availability + ", price=" + price
				+ ", category=" + category + ", made=" + made + "]";
	}
	
	
	
}
*/



package com.ssi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private String pcode;
	private String pname;
	private int price;
	public Product(String pcode, String pname, int price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	public Product(String pcode) {
		super();
		this.pcode = pcode;
	}
	public Product() {
		super();
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
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
	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", price=" + price + "]";
	}
	
	
	
	}
