package hibernateDayOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int empno;
	private String ename;
	private Address address;
	private int salary;
	@ManyToMany
	private List<Laptop> laptop = new ArrayList<Laptop>(); 
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int empno, String ename, Address address, int salary,Laptop laptop) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.address = address;
		this.salary = salary;
	}
	public Employee(int empno) {
		super();
		this.empno =empno ;
	}
	public Employee() {
		super();
	}
	
}
