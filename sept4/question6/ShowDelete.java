import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

class ShowDelete{
    public static void main(String[] args) throws IOException{
        File f1=new File(args[0]);
        f1.createNewFile();
        FileWriter fw=new FileWriter(args[0]);
        fw.write("hello NEW FILE CREATED ");
        fw.close();
        FileInputStream fin=new FileInputStream(f1);
        int n;
        
        while(( n = fin.read())!=-1){
            System.out.print((char)n);
        }
        fin.close();
        System.out.println(f1.delete());

    }
}