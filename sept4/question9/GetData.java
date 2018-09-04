import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class GetData{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Employee emp;
        FileInputStream fin =new FileInputStream("EmployeeObject.txt");
        ObjectInputStream oin=new ObjectInputStream(fin);
        emp=(Employee)oin.readObject();
        emp.show();
        oin.close();
        fin.close();
    }
}