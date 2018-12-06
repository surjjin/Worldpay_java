package mvcSept20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProductService {
	Connection con;
	public ProductService() {
		con=new Connect().connect();
	}
	public void insert(Product p) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into eshop_product values(?,?,?,?,?)");
			ps.setInt(1,p.getPcode());
			ps.setString(2, p.getName());
			ps.setString(3, p.getDsc());
			ps.setInt(4, p.getCatid());
			ps.setInt(5, p.getPrice());
			ps.executeUpdate();
			System.out.println(p.getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
