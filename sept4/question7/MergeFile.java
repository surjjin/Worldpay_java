import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.FileInputStream;

class MergeFile{
    public static void main(String[] args) throws IOException{
        FileInputStream f1=new FileInputStream("data1.txt");
        FileInputStream f2=new FileInputStream("data2.txt");
        SequenceInputStream sq=new SequenceInputStream(f1, f2);
        FileOutputStream fout =new FileOutputStream("merge.txt");
        int n;
        while((n=sq.read())!=-1){
            fout.write(n);
        }
    }
}