package customTag;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public HashSet<Product> searchByCategory(int ccode){
		HashSet<Product> hs=new HashSet<>();
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from eshop_product where catid=?");
			ps.setInt(1, ccode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Product p=new Product();
				p.setPcode(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDsc(rs.getString(3));
				p.setCatid(rs.getInt(4));
				p.setPrice(rs.getInt(5));
				hs.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hs;
	}
		
	
	
	public HashSet<Product> searchAll() {
		HashSet<Product> hs=new HashSet<>();
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from eshop_product");
			while(rs.next()) {
				Product p=new Product();
				p.setPcode(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setDsc(rs.getString(3));
				p.setCatid(rs.getInt(4));
				p.setPrice(rs.getInt(5));
				hs.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hs;
	}
	
	public Product searchPcode(int pcode) {
		PreparedStatement ps;
		Product p=new Product();
		try {
			ps = con.prepareStatement("select * from eshop_product where pcode=?");
			ps.setInt(1,pcode);
			ResultSet rs = ps.executeQuery();
			rs.next();
			p.setPcode(pcode);
			p.setName(rs.getString("name"));
			p.setDsc(rs.getString("dsc"));
			p.setCatid(rs.getInt("catid"));
			p.setPrice(rs.getInt("price"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
	public void updateProduct(Product p) {
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("select pcode,name,dsc,catid,price from eshop_product where pcode=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ps.setInt(1, p.getPcode());
			ResultSet rs = ps.executeQuery();
			rs.next();
			rs.updateInt("pcode", p.getPcode());
			rs.updateInt("catid", p.getCatid());
			rs.updateInt("price", p.getPrice());
			rs.updateString("name", p.getName());
			rs.updateString("dsc", p.getDsc());
			rs.updateRow();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
