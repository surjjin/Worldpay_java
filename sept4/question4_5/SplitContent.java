import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class SplitContent{
    public static void main(String[] as) throws IOException{
        File f1=new File(as[0]);
        FileInputStream fin =new FileInputStream(f1);
        FileOutputStream fout;
        int n= Integer.parseInt(as[1]);
        if(n<2)
        System.out.println("2nd argument must be higher");
        else
        {
            int f=fin.available();
            int i=1;
            byte b[]=new byte[f/n];
            StringBuffer s=new StringBuffer(as[0]);
            s.replace(s.lastIndexOf("."), s.length(),"");
            String name;
            
            while(i<=n){
                name=s+String.valueOf(i)+".txt";
                fout=new FileOutputStream(name);    
                fin.read(b);
                fout.write(b);
                    i++;
                fout.close();
                
            }
            
            
        }
        
        fin.close();
    }
}