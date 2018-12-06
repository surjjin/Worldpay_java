
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author suraj jain
 */
public class QueTenDoa {
    Connection con;

    public QueTenDoa() {
        con=new Connect().connect();
        
    }
    
    
    public int addProduct(Product p){
        int n=0;
        try {
            PreparedStatement ps = con.prepareStatement("insert into newproduct values(?,?,?,?)");
            ps.setInt(1, p.getPcode());
            ps.setString(2, p.getPtitle());
            ps.setInt(3, p.getSal());
            ps.setString(4, p.getBrand());            
            n =ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(QueTenDoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public int updateProduct(Product p){
        int n=0;
        try {
            Statement st;
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from newproduct");
            rs.next();
            rs.moveToInsertRow();
            rs.updateInt(1, p.getPcode());
            rs.updateString(2, p.getPtitle());
            rs.updateInt(3,p.getSal());
            rs.updateString(4, p.getBrand());
            rs.updateRow();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(QueTenDoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    public int deleteProduct(Product p){
        int n=0;
        try {
            Statement st;
            st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from newproduct");
            rs.next();
            rs.deleteRow();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(QueTenDoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return n;
    }
    
    public Product searchproduct(int pcode){
        Product p=new Product();
        try {
            PreparedStatement ps = con.prepareStatement("select * from newProduct where pcode=?");
            ResultSet rs = ps.executeQuery();
            rs.next();
            
            p.setPcode(pcode);
            p.setPtitle(rs.getString(2));
            p.setSal(rs.getInt(3));
            p.setBrand(rs.getString(4));
        } catch (SQLException ex) {
            Logger.getLogger(QueTenDoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
       
    }
    public HashSet<Product> searchProduct(String brand){
        HashSet<Product> hs=new HashSet<>();
        try {
            PreparedStatement ps = con.prepareStatement("select * from newProduct where brand=?");
            ps.setString(1, brand);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
               Product p=new Product();
               p.setPcode(rs.getInt(1));
               p.setPtitle(rs.getString(2));
               p.setSal(rs.getInt(3));
               p.setBrand(rs.getString(4));
               hs.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QueTenDoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hs;  
    }
    
}
