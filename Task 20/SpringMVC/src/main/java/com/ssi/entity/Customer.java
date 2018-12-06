package com.ssi.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String code;
	private String cname;
	private String address;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String code, String cname, String address) {
		super();
		this.code = code;
		this.cname = cname;
		this.address = address;
	}
	public Customer(String code) {
		super();
		this.code = code;
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [code=" + code + ", cname=" + cname + ", address="
				+ address + "]";
	}
	
	
}
