package springSept27QueThree;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Connect implements InitializingBean,DisposableBean{
	String classname;
	String url;
	String username;
	String password;
	Connection con;
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	public Connect(String classname, String url, String username, String password, Connection con) {
		super();
		this.classname = classname;
		this.url = url;
		this.username = username;
		this.password = password;
		this.con = con;
	}
	public Connect() {
		super();
	}
	public void destroy() throws Exception {
		con.close();
		
	}
	public void afterPropertiesSet() throws Exception {
		Class.forName(classname);
		con = DriverManager.getConnection(url, username, password);
	}
	
}
