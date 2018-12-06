package springSept27QueTwo;

public class Info {
	String qualification;
	String state;
	String city;
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Info() {
		super();
	}
	public Info(String qualification, String state, String city) {
		super();
		this.qualification = qualification;
		this.state = state;
		this.city = city;
	}
	
}
