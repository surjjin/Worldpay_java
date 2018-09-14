
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.StringTokenizer;

public class QueFourNVL {
    public static void main(String as[]) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        File f= new File("myconfig.txt");
        FileInputStream fin=new FileInputStream(f);
        //System.out.println(f.length());
        byte b[]=new byte[fin.available()];
        int read = fin.read(b);
        //System.out.println(read);
        String s = new String(b);
        System.out.println(s);
        
        StringTokenizer st = new StringTokenizer(s, "=,");
        String a[]=new String[4];
        int i=0;
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken());
            a[i++]=st.nextToken();
        }
        for(String s1:a){
                System.out.println(s1);
            }
        Class.forName(a[0]);
        Connection c=DriverManager.getConnection(a[1],a[2],a[3]);
        
    }
}
