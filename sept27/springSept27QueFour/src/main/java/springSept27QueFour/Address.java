package springSept27QueFour;

public class Address {
	int houseno;
	String street;
	int pincode;
	String city;
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
		street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	public Address(int houseno, String street, int pincode, String city) {
		super();
		this.houseno = houseno;
		street = street;
		this.pincode = pincode;
		city = city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return houseno+street+pincode+city;
	}
	
}
