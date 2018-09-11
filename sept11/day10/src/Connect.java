
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Connect {
    public Connection connect(){
        Connection c = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott", "tiger");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QueOneRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QueOneRegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
    
    
}
