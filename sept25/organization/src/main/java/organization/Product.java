package organization;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Product {
	@Id
	private int pcode;
	private String pname;
	private int price;
	private String brand;
	@ManyToMany(mappedBy="product")
	private List<Employee> employee=new ArrayList<Employee>();
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Product(int pcode, String pname, int price, String brand, List<Employee> employee) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.brand = brand;
		this.employee = employee;
	}
	public Product(int pcode) {
		super();
		this.pcode = pcode;
	}
	public Product(int pcode, String pname, int price, String brand) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
	public Product() {
		super();
	}
	
	
	
}
