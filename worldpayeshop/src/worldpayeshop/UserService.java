package worldpayeshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {
	Connection con;
	public UserService() {
		con=new Connect().connect();
	}
	public int insertUser(User u) {
		int n = 0;
		try {
			PreparedStatement ps=con.prepareStatement("insert into eshop_userdetail values(?,?,?,?,?)");
			ps.setString(1, u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getGender());
			ps.setString(4, u.getName());
			ps.setString(5, u.getCity());
			n=ps.executeUpdate();
			System.out.println(u.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return n;
		
	}
	public void updateUser(User u) {
		PreparedStatement ps;
		
		try {
			ps = con.prepareStatement("select username,password,name,gender,city from eshop_userdetail where username=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ps.setString(1, u.getUsername());
			ResultSet rs = ps.executeQuery();
			rs.next();
			System.out.println(rs.getString(4));
			//rs.updateString("usernmae", u.getUsername());
			rs.updateString("password", u.getPassword());
			rs.updateString("name", u.getName());
			rs.updateString("gender", u.getGender());
			rs.updateString("city", u.getCity());
			rs.updateRow();
			
//			Statement st=con.createStatement();
//			st.executeQuery("commit");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public User searchUser(String username) {
		PreparedStatement ps;
		User u = new User();
		try {
			ps = con.prepareStatement("select * from eshop_userdetail where username=?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				
				u.setUsername(username);
				u.setPassword(rs.getString(2));
				u.setGender(rs.getString(3));
				u.setName(rs.getString(4));
				u.setCity(rs.getString(5));
			}
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	public String searchUser(String username,String password) {
		try {
			PreparedStatement ps=con.prepareStatement("select name from eshop_userdetail where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
				return rs.getString(1);
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}

