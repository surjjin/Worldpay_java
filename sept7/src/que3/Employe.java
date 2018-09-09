package que3;

import java.util.Random;

public class Employe {
    private int eno;
    private String ename;
    private int sal;
    private String desg;
    private String dept;
    
    public Employe(String ename){
    	String s[]={"manager","developer","tester"};
    	String d[]={"sales","security","production","testing"};
    	Random rand=new Random();
    	eno=rand.nextInt(999)+101;
    	this.ename=ename;
    	sal=rand.nextInt(10000)+1000;
    	desg=s[rand.nextInt(2)+0];
    	dept=d[rand.nextInt(3)+0];
    	
    }
    public void display(){
    	System.out.println("eno: "+getEno()+" ename: "+getEname()+" sal :"+getSal()+" desg: "+getDesg()+"dept: "+getDept());    	
    }
    
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public boolean equals(Object obj) {
		Employe e=(Employe) obj;
		if (ename.equals(e.ename)) 
			return true;
		else
			return false;
	}
    
	
}
