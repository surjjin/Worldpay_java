package organization;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Area {
	@Id
	private int acode;
	private String city;
	private String state;
	@ManyToOne
	private Employee employee;
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public int getAcode() {
		return acode;
	}
	public void setAcode(int acode) {
		this.acode = acode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Area(int acode, String city, String state,Employee employee) {
		super();
		this.acode = acode;
		this.city = city;
		this.state = state;
		this.employee =employee;
	}
	public Area(int acode, String city, String state) {
		super();
		this.acode = acode;
		this.city = city;
		this.state = state;
	}
	public Area(int acode) {
		super();
		this.acode = acode;
	}
	public Area() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
