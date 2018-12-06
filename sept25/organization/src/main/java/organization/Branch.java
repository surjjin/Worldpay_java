package organization;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Branch {
	@Id
	private int bcode;
	private String bname;
	private Address address;
	@OneToMany
	private List<Employee> employee=new ArrayList<Employee>();
	public int getBcode() {
		return bcode;
	}
	public void setBcode(int bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Branch(int bcode, String bname, Address address, List<Employee> employee) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.address = address;
		this.employee = employee;
	}
	public Branch(int bcode, String bname) {
		super();
		this.bcode = bcode;
		this.bname = bname;
	}
	public Branch(int bcode) {
		super();
		this.bcode = bcode;
	}
	public Branch() {
		super();
	}
	
	
}
