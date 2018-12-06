package eshop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserServices {
	Connection con;
	public UserServices() {
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
}
