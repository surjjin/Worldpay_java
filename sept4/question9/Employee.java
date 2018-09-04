import java.io.Serializable;

public class Employee implements Serializable{
    private int eno;
    private String ename;
    private int sal;
    private String desg;
    private String dept;

    
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setEno(int eno) {
        this.eno = eno;
    }
    public void setSal(int sal) {
        this.sal = sal;
    }

    public void show(){
        System.out.println("eno "+eno);
        System.out.println("ename "+ename);
        System.out.println("sal "+sal);
        System.out.println("desg "+desg);
        System.out.println("dept "+dept);
    }
}