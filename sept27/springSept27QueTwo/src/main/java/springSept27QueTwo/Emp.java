package springSept27QueTwo;

public class Emp {
	int eno;
	String ename;
	String qualification;
	String state;
	String city;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
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
	public Emp(int eno, String ename, String qualification, String state, String city) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.qualification = qualification;
		this.state = state;
		this.city = city;
	}
	public Emp() {
		super();
	}
	
	public Emp(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eno+ename+qualification+state+city;
	}
	 
}
