import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

class EmployeeFiller{
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();
        System.out.println("eno ");
        emp.setEno(sc.nextInt());
        System.out.println("ename ");
        emp.setEname(sc.next());
        System.out.println("sal ");
        emp.setSal(sc.nextInt());
        System.out.println("desg ");
        emp.setDesg(sc.next());
        System.out.println("dept ");
        emp.setDept(sc.next());

        emp.show();
        FileOutputStream fout = new FileOutputStream("EmployeeObject.txt");
        ObjectOutputStream oot =new ObjectOutputStream(fout);
        oot.writeObject(emp);
        oot.close();
        fout.close(); 
    }
}