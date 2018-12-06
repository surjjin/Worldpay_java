package worldpayeshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
	public Connection connect(){
        Connection c = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
        } catch (SQLException ex) { 
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
    public Connection connectMysql(){
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/suraj","root", "root");
        } catch (SQLException ex) { 
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
//    public static void main(String args[]) throws Exception {
//    	Connect ob=new Connect();
//    	ob.connect();
//    	System.out.println("working");
//    }
}

