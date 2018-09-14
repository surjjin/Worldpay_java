import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class QueThreeFileConnection {
    public static void main(String as[]) throws FileNotFoundException, IOException{
        try {
            FileInputStream fin=new FileInputStream("myconfig.txt");
            //DataInputStream din =new DataInputStream(fin);
            
            System.out.print(+fin.available());
            byte b[] = new byte[fin.available()];
            fin.read(b);
            //for(byte b1:b)
            //System.out.println(b1);
            String s=new String(b);
            System.out.print("s: "+s);
            int ep=0;
            int cp=0;
            int i=0;
            String a[]=new String[4];
            
            for(i=0;i<a.length;i++){
                
                ep=s.indexOf("=",cp);
                cp=s.indexOf(",", ep);
                System.out.println(cp+"\t"+ep);
                a[i]=s.substring(ep+1, cp);
            }
            for(String s1:a){
                System.out.println(s1);
            }
            
            Class.forName(a[0]);
           Connection c=DriverManager.getConnection(a[1],a[2],a[3]);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QueThreeFileConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QueThreeFileConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
       
    }
}
