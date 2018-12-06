package organization;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	@Id
	private int eno;
	private Name name;
	private Address address;
	@ManyToOne
	private Branch branch;
	@OneToMany
	private List<Area> area=new ArrayList<Area>();
	@ManyToMany
	private List<Product> product=new ArrayList<Product>();
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<Area> getArea() {
		return area;
	}
	public void setArea(List<Area> area) {
		this.area = area;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public Employee(int eno, Name name, Address address, Branch branch, List<Area> area, List<Product> product) {
		super();
		this.eno = eno;
		this.name = name;
		this.address = address;
		this.branch = branch;
		this.area = area;
		this.product = product;
	}
	public Employee(int eno) {
		super();
		this.eno = eno;
	}
	public Employee() {
		super();
	}
	
}
