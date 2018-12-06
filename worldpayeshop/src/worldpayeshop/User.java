package worldpayeshop;

public class User {
	private String username;
	private String password;
	private String gender;
	private String name;
	private String city;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username,String password,String gender,String name,String city ) {
		// TODO Auto-generated constructor stub
		setUsername(username);
		setPassword(password);
		setGender(gender);
		setName(name);
		setCity(city);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
