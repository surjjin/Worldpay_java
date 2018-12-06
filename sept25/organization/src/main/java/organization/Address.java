package organization;


import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private int houseno;
	private String street;
	private String city;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int houseno, String street, String city) {
		super();
		this.houseno = houseno;
		this.street = street;
		this.city = city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return houseno+street+city;
	}
	
}
