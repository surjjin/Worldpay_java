import java.util.Comparator;
import java.util.Random;

public class Student implements Comparable<Student>,Comparator<Student>{
	private int rno;
	private String name;
	private String branch;
	private int sem;
	private int marks;
	
	Random rand=new Random();
	Student(String name){
		fill(name);
	}
	public void fill(String name) {
		String b[]= {"cs","it","ip","ec"};
		rno=rand.nextInt(100)+1;
		this.name=name;
		branch=b[rand.nextInt(4)];
		sem=rand.nextInt(8)+1;
		marks=rand.nextInt(100)+20;
	}
	public void display() {
		System.out.print(rno+"\t");
		System.out.print(name+"\t");
		System.out.print(branch+"\t");
		System.out.print(sem+"\t");
		System.out.print(marks+"\t");
	}
	public int getRno() {
		return rno;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	public int getSem() {
		return sem;
	}
	public int getMarks() {
		return marks;
	}
	public Random getRand() {
		return rand;
	}
	
	@Override
	public int compareTo(Student o) {
		if(marks>o.marks)
			return 1;
		else if(marks<o.marks)
			return -1;
		else
		{
			if(rno>o.rno)
				return 1;
			else
				return -1;
		}
		
		// TODO Auto-generated method stub
	}
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
		
	}
	
	
	
		
	
}
