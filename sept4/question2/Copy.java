import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Copy{
    public static void main(String[] as) throws IOException{
        FileInputStream fin=new FileInputStream(as[0]);
        FileOutputStream fout=new FileOutputStream(as[1]);
        byte b[]=new byte[fin.available()];
        fin.read(b);
        fout.write(b);
        fout.flush();
        fin.close();
        fout.close();
    }
}