package hibernateDayOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	@Id
	private int code;
	private String brand;
	private int price;
	@ManyToMany(mappedBy="laptop")
	private List<Employee> employee=new ArrayList<Employee>();
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Laptop(int code, String brand, int price) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
	}
	public Laptop(int code) {
		super();
		this.code = code;
	}
	public Laptop() {
		super();
	}
	
}
