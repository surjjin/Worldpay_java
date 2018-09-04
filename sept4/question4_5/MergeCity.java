import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class MergeCity{
    public static void main(String[] args) throws IOException{
        FileInputStream f1=new FileInputStream("data.txt1");
        FileInputStream f2=new FileInputStream("data.txt2");
        FileInputStream f3=new FileInputStream("data.txt3");
        FileOutputStream fout = new FileOutputStream("mergedata.txt",true);
        byte b1[]=new byte[f1.available()];
        f1.read(b1);
        fout.write(b1);
        byte b2[]=new byte[f2.available()];
        f2.read(b2);
        fout.write(b2);
        byte b3[]=new byte[f3.available()];
        f3.read(b3);
        fout.write(b3);
        //SequenceInputStream sq=new SequenceInputStream(f1, f2);
    }
}